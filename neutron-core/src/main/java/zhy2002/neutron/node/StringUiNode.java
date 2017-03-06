package zhy2002.neutron.node;

import jsinterop.annotations.JsType;
import zhy2002.neutron.ChangeTrackingModeEnum;
import zhy2002.neutron.LeafUiNode;
import zhy2002.neutron.ParentUiNode;
import zhy2002.neutron.util.NeutronEventSubjects;
import zhy2002.neutron.util.ValueUtil;

/**
 * String leaf node.
 */
@JsType
public abstract class StringUiNode<P extends ParentUiNode<?>> extends LeafUiNode<P, String> {

    protected StringUiNode(P parent, String name) {
        super(parent, name);

        setChangeTrackingMode(NeutronEventSubjects.VALUE, ChangeTrackingModeEnum.Value);
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
    public boolean hasValue() {

        String value = getValue();
        return !ValueUtil.isEmpty(value);
    }

    @Override
    public Class<String> getValueClass() {
        return String.class;
    }

    public String getPattern() {
        return super.getStateValue(NeutronEventSubjects.PATTERN);
    }

    public void setPattern(String value) {
        super.setStateValue(NeutronEventSubjects.PATTERN, String.class, value);
    }

    public String getPatternMessage() {
        return getStateValue(NeutronEventSubjects.PATTERN_MESSAGE, "Pattern is invalid.");
    }

    public void setPatternMessage(String message) {
        setStateValue(NeutronEventSubjects.PATTERN_MESSAGE, String.class, message);
    }

    public Integer getMinLength() {
        return super.getStateValue(NeutronEventSubjects.MIN_LENGTH);
    }

    public void setMinLength(Integer length) {
        super.setStateValue(NeutronEventSubjects.MIN_LENGTH, Integer.class, length);
    }

    public Integer getMaxLength() {
        return super.getStateValue(NeutronEventSubjects.MAX_LENGTH);
    }

    public void setMaxLength(Integer length) {
        super.setStateValue(NeutronEventSubjects.MAX_LENGTH, Integer.class, length);
    }

    public String getLengthMessage() {
        return getStateValue(NeutronEventSubjects.LENGTH_MESSAGE, "Length is invalid.");
    }

    public void setLengthMessage(String message) {
        setStateValue(NeutronEventSubjects.LENGTH_MESSAGE, String.class, message);
    }

    public String getInvalidChars() {
        return super.getStateValue(NeutronEventSubjects.INVALID_CHARS);
    }

    public void setInvalidChars(String invalidChars) {
        super.setStateValue(NeutronEventSubjects.INVALID_CHARS, String.class, invalidChars);
    }

    public String getInvalidCharsMessage() {
        return getStateValue(NeutronEventSubjects.INVALID_CHARS_MESSAGE, "Cannot contain invalid chars.");
    }

    public void setInvalidCharsMessage(String message) {
        setStateValue(NeutronEventSubjects.INVALID_CHARS_MESSAGE, String.class, message);
    }
}
