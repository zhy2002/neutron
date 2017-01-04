package zhy2002.neutron.node;

import jsinterop.annotations.JsMethod;
import zhy2002.neutron.*;
import zhy2002.neutron.rule.RangeValidationRule;
import zhy2002.neutron.util.NeutronEventSubjects;
import zhy2002.neutron.util.ValueUtil;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

/**
 * A LeafUiNode that can contain a number as its value.
 */
public class BigDecimalUiNode<P extends ParentUiNode<?>> extends LeafUiNode<P, BigDecimal> {

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

        init();
    }

    protected BigDecimalUiNode(@NotNull AbstractUiNodeContext context) {
        super(context);

        init();
    }

    private void init() {
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
    public BigDecimal getMinValue() {
        return super.getStateValue(NeutronEventSubjects.MIN_VALUE);
    }

    public void setMinValue(BigDecimal value) {
        super.setStateValue(NeutronEventSubjects.MIN_VALUE, BigDecimal.class, value);
    }

    @JsMethod
    public BigDecimal getMaxValue() {
        return super.getStateValue(NeutronEventSubjects.MAX_VALUE);
    }

    public void setMaxValue(BigDecimal value) {
        super.setStateValue(NeutronEventSubjects.MAX_VALUE, BigDecimal.class, value);
    }

    @JsMethod
    @Override
    public BigDecimal getValue() {
        return super.getValue();
    }

    @Override
    public void setValue(BigDecimal value) {
        this.setValue(BigDecimal.class, value);
    }

    @Override
    public <T> void setStateValue(String key, Class<T> valueClass, T value, ChangeTrackingModeEnum mode) {
        if (!getContext().isInCycle()) {
            if (NeutronEventSubjects.VALUE.equals(key)) {
                hasValue = value != null;
                if (!hasValue) {
                    super.setStateValue(NeutronEventSubjects.VALUE_TEXT, String.class, "", mode);
                    return;
                }
            } else if (NeutronEventSubjects.VALUE_TEXT.equals(key)) {
                hasValue = !ValueUtil.isEmpty((String) value);
            }
        }

        super.setStateValue(key, valueClass, value, mode);
    }

    @JsMethod
    public String getText() {
        return this.getStateValue(NeutronEventSubjects.VALUE_TEXT);
    }

    @JsMethod
    public void setText(String text) {
        setStateValue(NeutronEventSubjects.VALUE_TEXT, String.class, text);
    }

    @Override
    protected void setStateValueInternal(String key, Object value) {
        super.setStateValueInternal(key, value);
        if (NeutronEventSubjects.VALUE_TEXT.equals(key)) {
            BigDecimal val = getParser().parse(value.toString());
            if (!Objects.equals(val, getValue())) {
                setValue(val);
            }
        } else if (NeutronEventSubjects.VALUE.equals(key) && value != null) {
            String text = getFormatter().format((BigDecimal) value);
            if (!Objects.equals(text, getText())) {
                setText(text);
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

    public String getRangeMessage() {
        return getStateValue(NeutronEventSubjects.RANGE_MESSAGE, "Value is out of range.");
    }

    public void setRangeMessage(String message) {
        setStateValue(NeutronEventSubjects.RANGE_MESSAGE, String.class, message);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

        UiNodeContext<?> context = getContext();
        createdRules.add(context.createUiNodeRule(RangeValidationRule.class, this));
    }
}
