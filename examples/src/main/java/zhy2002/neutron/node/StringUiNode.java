package zhy2002.neutron.node;

import jsinterop.annotations.JsType;
import zhy2002.neutron.*;
import zhy2002.neutron.rule.InvalidCharPreChangeRule;
import zhy2002.neutron.rule.LengthValidationRule;
import zhy2002.neutron.rule.PatternValidationRule;
import zhy2002.neutron.util.EnhancedLinkedList;
import zhy2002.neutron.util.ValueUtil;

/**
 * String leaf node.
 */
@JsType
public abstract class StringUiNode<P extends ParentUiNode<?>> extends LeafUiNode<P, String> {

    protected StringUiNode(P parent, String name) {
        super(parent, name);

        init();
    }

    protected StringUiNode(AbstractUiNodeContext context) {
        super(context);

        init();
    }

    private void init() {
        setChangeTrackingMode(ChangeTrackingModeEnum.Value);
        this.setValue("");
    }

    @Override
    public final String getValue() {
        return super.getValue();
    }

    @Override
    public final void setValue(String value) {
        super.setValue(String.class, value);
    }

    @Override
    public Class<String> getValueClass() {
        return String.class;
    }

    public String getPattern() {
        return super.getStateValue(PredefinedEventSubjects.PATTERN);
    }

    public void setPattern(String value) {
        super.setStateValue(PredefinedEventSubjects.PATTERN, String.class, value);
    }

    public Integer getMinLength() {
        return super.getStateValue(PredefinedEventSubjects.MIN_LENGTH);
    }

    public void setMinLength(Integer length) {
        super.setStateValue(PredefinedEventSubjects.MIN_LENGTH, Integer.class, length);
    }

    public Integer getMaxLength() {
        return super.getStateValue(PredefinedEventSubjects.MAX_LENGTH);
    }

    public void setMaxLength(Integer length) {
        super.setStateValue(PredefinedEventSubjects.MAX_LENGTH, Integer.class, length);
    }

    public String getInvalidChars() {
        return super.getStateValue(PredefinedEventSubjects.INVALID_CHARS);
    }

    public void setInvalidChars(String invalidChars) {
        super.setStateValue(PredefinedEventSubjects.INVALID_CHARS, String.class, invalidChars);
    }

    public String getInvalidCharsMessage() {
        return getStateValue(PredefinedEventSubjects.INVALID_CHARS_MESSAGE, "Cannot contain invalid chars.");
    }

    public void setInvalidCharsMessage(String message) {
        setStateValue(PredefinedEventSubjects.INVALID_CHARS_MESSAGE, String.class, message);
    }

    public String getLengthMessage() {
        return getStateValue(PredefinedEventSubjects.LENGTH_MESSAGE, "Length is invalid.");
    }

    public void setLengthMessage(String message) {
        setStateValue(PredefinedEventSubjects.LENGTH_MESSAGE, String.class, message);
    }

    public String getPatternMessage() {
        return getStateValue(PredefinedEventSubjects.PATTERN_MESSAGE, "Pattern is invalid.");
    }

    public void setPatternMessage(String message) {
        setStateValue(PredefinedEventSubjects.PATTERN_MESSAGE, String.class, message);
    }

    @Override
    public boolean hasValue() {

        String value = getValue();
        return !ValueUtil.isEmpty(value);
    }

    @Override
    protected EnhancedLinkedList<UiNodeRule<?>> createOwnRules() {
        return super.createOwnRules()
                .and(getContext().createUiNodeRule(PatternValidationRule.class, this))
                .and(getContext().createUiNodeRule(LengthValidationRule.class, this))
                .and(getContext().createUiNodeRule(InvalidCharPreChangeRule.class, this));
    }
}
