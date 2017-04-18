package zhy2002.neutron.node;

import jsinterop.annotations.JsMethod;
import zhy2002.neutron.LeafUiNode;
import zhy2002.neutron.ParentUiNode;
import zhy2002.neutron.ValueFormatter;
import zhy2002.neutron.ValueParser;
import zhy2002.neutron.config.MetadataRegistry;
import zhy2002.neutron.config.PropertyMetadata;
import zhy2002.neutron.data.BigDecimalOption;
import zhy2002.neutron.util.NeutronEventSubjects;
import zhy2002.neutron.util.ValueUtil;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Objects;

/**
 * A LeafUiNode that can contain a number as its value.
 */
public abstract class BigDecimalUiNode<P extends ParentUiNode<?>> extends LeafUiNode<P, BigDecimal> {

    private static final ValueParser<BigDecimal> DEFAULT_PARSER = (t) -> {
        if (t != null && t.matches("^\\d+(\\.\\d+)?$"))
            return new BigDecimal(t);
        return null;
    };

    private static final ValueFormatter<BigDecimal> DEFAULT_FORMATTER = (v) -> v == null ? "" : v.toString();

    private ValueParser<BigDecimal> parser;
    private ValueFormatter<BigDecimal> formatter;
    private boolean hasValue;

    protected BigDecimalUiNode(@NotNull P parent, @NotNull String name) {
        super(parent, name);

        this.setText("");
    }

    public ValueParser<BigDecimal> getParser() {
        return parser == null ? DEFAULT_PARSER : parser;
    }

    public void setParser(ValueParser<BigDecimal> parser) {
        this.parser = parser;
    }

    public ValueFormatter<BigDecimal> getFormatter() {
        return formatter == null ? DEFAULT_FORMATTER : formatter;
    }

    public void setFormatter(ValueFormatter<BigDecimal> formatter) {
        this.formatter = formatter;
    }

    @JsMethod
    @Override
    public BigDecimal getValue() {
        return super.getValue();
    }

    @NotNull
    @JsMethod
    @Override
    public void setValue(BigDecimal value) {
        this.setValue(BigDecimal.class, value);
    }

    @Override
    public <T> void setStateValue(String key, Class<T> valueClass, T value) {
        if (!getContext().isInCycle()) {
            if (NeutronEventSubjects.VALUE.equals(key)) {
                hasValue = value != null;
                if (!hasValue) {
                    super.setStateValue(VALUE_TEXT_PROPERTY.getStateKey(), String.class, "");
                    return;
                }
            } else if (VALUE_TEXT_PROPERTY.getStateKey().equals(key)) {
                hasValue = !ValueUtil.isEmpty((String) value);
            }
        }

        super.setStateValue(key, valueClass, value);
    }

    @Override
    protected void setStateValueDirectly(String key, Object value) {
        super.setStateValueDirectly(key, value);
        if (VALUE_TEXT_PROPERTY.getStateKey().equals(key)) {
            BigDecimal val = getParser().parse(value.toString());
            if (val == null && !ValueUtil.isEmpty(value.toString())) {
                setValueValid(false);
            } else {
                setValueValid(true);
            }
            if (!Objects.equals(val, getValue())) {
                setValue(val);
            }
        } else if (NeutronEventSubjects.VALUE.equals(key)) {
            if (value == null) {
                if (getParser().parse(getText()) != null) {
                    setText("");
                }
            } else {
                setValueValid(true);
                String text = getFormatter().format((BigDecimal) value);
                if (!Objects.equals(text, getText())) {
                    setText(text);
                }
            }
        }
    }

    @Override
    public boolean hasValue() {
        return hasValue;
    }

    @Override
    public Class<BigDecimal> getValueClass() {
        return BigDecimal.class;
    }

    //region node properties

    public static final PropertyMetadata<Boolean> VALUE_VALID_PROPERTY = MetadataRegistry.createProperty(BigDecimalUiNode.class, "valueValid", Boolean.class, Boolean.FALSE);
    public static final PropertyMetadata<String> VALUE_TEXT_PROPERTY = MetadataRegistry.createProperty(BigDecimalUiNode.class, "valueText", String.class);
    public static final PropertyMetadata<String> RANGE_MESSAGE_PROPERTY = MetadataRegistry.createProperty(BigDecimalUiNode.class, "rangeMessage", String.class, "Value is out of range.");
    public static final PropertyMetadata<BigDecimal> MIN_VALUE_PROPERTY = MetadataRegistry.createProperty(BigDecimalUiNode.class, "minValue", BigDecimal.class);
    public static final PropertyMetadata<BigDecimal> MAX_VALUE_PROPERTY = MetadataRegistry.createProperty(BigDecimalUiNode.class, "maxValue", BigDecimal.class);
    public static final PropertyMetadata<Object> OPTIONS_PROPERTY = MetadataRegistry.createProperty(StringUiNode.class, "options", Object.class);

    public boolean isValueValid() {
        return super.getStateValue(VALUE_VALID_PROPERTY);
    }

    private void setValueValid(boolean value) {
        super.setStateValue(VALUE_VALID_PROPERTY, value);
    }

    @JsMethod
    public String getText() {
        return this.getStateValue(VALUE_TEXT_PROPERTY);
    }

    @JsMethod
    public void setText(String text) {
        setStateValue(VALUE_TEXT_PROPERTY, text);
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
}
