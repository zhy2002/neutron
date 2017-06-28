package zhy2002.neutron.node;

import jsinterop.annotations.JsMethod;
import zhy2002.neutron.*;
import zhy2002.neutron.config.MetadataRegistry;
import zhy2002.neutron.config.NeutronConstants;
import zhy2002.neutron.config.PropertyMetadata;
import zhy2002.neutron.data.BigDecimalOption;
import zhy2002.neutron.data.NodeIdentity;
import zhy2002.neutron.di.Owner;
import zhy2002.neutron.event.BigDecimalStateChangeEvent;
import zhy2002.neutron.event.BigDecimalStateChangeEventBinding;
import zhy2002.neutron.event.StringStateChangeEvent;
import zhy2002.neutron.event.StringStateChangeEventBinding;
import zhy2002.neutron.util.ValueUtil;

import javax.inject.Inject;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collection;


/**
 * A LeafUiNode that can contain a number as its value.
 */
public abstract class BigDecimalUiNode<P extends ParentUiNode<?>> extends LeafUiNode<P, BigDecimal> {

    protected BigDecimalUiNode(@NotNull P parent) {
        super(parent);
    }

    /**
     * @return true if get value is not empty.
     */
    @Override
    public boolean hasValue() {
        return super.hasValue() || !ValueUtil.isEmpty(getText());
    }

    public boolean containsValue() {
        return getStateValueDirectly(VALUE_PROPERTY.getStateKey()) != null;
    }

    /**
     * @return true if the returned value is from the state of this node (not inherited or configured).
     */
    @Override
    public Class<BigDecimal> getValueClass() {
        return BigDecimal.class;
    }

    @Override
    public PropertyMetadata<BigDecimal> getValuePropertyMetadata() {
        return VALUE_PROPERTY;
    }

    //region node properties

    public static final PropertyMetadata<BigDecimal> VALUE_PROPERTY = MetadataRegistry.createProperty(BigDecimalUiNode.class, "value", BigDecimal.class);
    public static final PropertyMetadata<Boolean> VALUE_VALID_PROPERTY = MetadataRegistry.createProperty(BigDecimalUiNode.class, "valueValid", Boolean.class, Boolean.TRUE);
    public static final PropertyMetadata<Boolean> INTEGER_VALUE_PROPERTY = MetadataRegistry.createProperty(BigDecimalUiNode.class, "integerValue", Boolean.class, Boolean.FALSE);
    public static final PropertyMetadata<String> VALUE_TEXT_PROPERTY = MetadataRegistry.createProperty(BigDecimalUiNode.class, "valueText", String.class, "");
    public static final PropertyMetadata<String> VALUE_DISPLAY_FORMAT_PROPERTY = MetadataRegistry.createProperty(BigDecimalUiNode.class, "valueDisplayFormat", String.class);
    public static final PropertyMetadata<String> RANGE_MESSAGE_PROPERTY = MetadataRegistry.createProperty(BigDecimalUiNode.class, "rangeMessage", String.class, "Value must be in the range of [{min}, {max}].");
    public static final PropertyMetadata<BigDecimal> MIN_VALUE_PROPERTY = MetadataRegistry.createProperty(BigDecimalUiNode.class, "minValue", BigDecimal.class);
    public static final PropertyMetadata<BigDecimal> MAX_VALUE_PROPERTY = MetadataRegistry.createProperty(BigDecimalUiNode.class, "maxValue", BigDecimal.class);
    //todo validate allowed digits

    @JsMethod
    @Override
    public BigDecimal getValue() {
        return super.getStateValue(VALUE_PROPERTY);
    }

    @JsMethod
    @Override
    public void setValue(BigDecimal value) {
        super.setStateValue(VALUE_PROPERTY, value);
    }

    @Override
    protected void clearNodeIdentity() {
        NodeIdentity nodeIdentity = getNodeIdentity();
        if (nodeIdentity != null) {
            Object obj = nodeIdentity.getValue();
            if (obj != null) {
                String text = String.valueOf(obj);
                setText(text);
            }
        }

        super.clearNodeIdentity();
    }

    public boolean isValueValid() {
        return super.getStateValue(VALUE_VALID_PROPERTY);
    }

    private void setValueValid(boolean value) {
        super.setStateValue(VALUE_VALID_PROPERTY, value);
    }

    @JsMethod
    public boolean isIntegerValue() {
        return super.getStateValue(INTEGER_VALUE_PROPERTY);
    }

    private void setIntegerValue(boolean value) {
        super.setStateValue(INTEGER_VALUE_PROPERTY, value);
    }

    @JsMethod
    public String getText() {
        return this.getStateValue(VALUE_TEXT_PROPERTY);
    }

    @JsMethod
    public void setText(String text) {
        setStateValue(VALUE_TEXT_PROPERTY, text);
    }

    @JsMethod
    public String getValueDisplayFormat() {
        return getStateValue(VALUE_DISPLAY_FORMAT_PROPERTY);
    }

    public void setValueDisplayFormat(String name) {
        setStateValue(VALUE_DISPLAY_FORMAT_PROPERTY, name);
    }

    public String getRangeMessage() {
        return getStateValue(RANGE_MESSAGE_PROPERTY);
    }

    public void setRangeMessage(String message) {
        setStateValue(RANGE_MESSAGE_PROPERTY, message);
    }

    public BigDecimal getMinValue() {
        return super.getStateValue(MIN_VALUE_PROPERTY);
    }

    public void setMinValue(BigDecimal value) {
        super.setStateValue(MIN_VALUE_PROPERTY, value);
    }

    public BigDecimal getMaxValue() {
        return super.getStateValue(MAX_VALUE_PROPERTY);
    }

    public void setMaxValue(BigDecimal value) {
        super.setStateValue(MAX_VALUE_PROPERTY, value);
    }

    @JsMethod
    public BigDecimalOption[] getOptions() {
        BigDecimalOption[] options = (BigDecimalOption[]) getStateValue(OPTIONS_PROPERTY);
        BigDecimalOption[] result = null;
        if (options != null) {
            result = Arrays.copyOf(options, options.length);
        }
        return result;
    }

    @JsMethod
    public void setOptions(BigDecimalOption[] value) {
        setStateValue(OPTIONS_PROPERTY, value);
    }
    //endregion

    static class SyncValueTextRule extends UiNodeRule<BigDecimalUiNode<?>> {

        private static ValueParser<BigDecimal> parser = new BigDecimalParser();

        @Inject
        protected SyncValueTextRule(@Owner BigDecimalUiNode<?> owner) {
            super(owner);
        }

        @Override
        protected Collection<EventBinding> createEventBindings() {
            return Arrays.asList(
                    new RefreshEventBinding(
                            this::initialSync,
                            NeutronConstants.NODE_LOADED_REFRESH_REASON
                    ),
                    new BigDecimalStateChangeEventBinding(
                            e -> {
                                UiNodeEvent cause = e.getActivation() == null ? null : e.getActivation().getEvent();
                                return !(cause != null && cause.getOrigin() == getOwner() && cause.getSubject().equals(VALUE_TEXT_PROPERTY.getStateKey()));
                            },
                            this::updateText
                    ),
                    new StringStateChangeEventBinding(
                            e -> {
                                UiNodeEvent cause = e.getActivation() == null ? null : e.getActivation().getEvent();
                                return !(cause != null && cause.getOrigin() == getOwner() && cause.getSubject().equals(VALUE_PROPERTY.getStateKey()));
                            },
                            this::updateValue,
                            VALUE_TEXT_PROPERTY.getStateKey(),
                            null
                    )
            );
        }

        private void initialSync(RefreshUiNodeEvent event) {
            BigDecimal value = getOwner().getValue();
            String text = getOwner().getText();
            if (value != null && ValueUtil.isEmpty(text)) {
                getOwner().setText(parser.format(value));
            } else if (value == null && !ValueUtil.isEmpty(text)) {
                getOwner().setValue(parser.parse(text));
            }
        }

        private void updateText(BigDecimalStateChangeEvent event) {
            getOwner().setText(parser.format(event.getNewValue()));
        }

        private void updateValue(StringStateChangeEvent event) {
            BigDecimal value = parser.parse(event.getNewValue());
            getOwner().setValue(value);
            getOwner().setValueValid(value != null);
        }
    }
}
