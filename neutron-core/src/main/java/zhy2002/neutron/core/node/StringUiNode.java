package zhy2002.neutron.core.node;

import jsinterop.annotations.JsIgnore;
import jsinterop.annotations.JsMethod;
import zhy2002.neutron.core.ChangeTrackingModeEnum;
import zhy2002.neutron.core.LeafUiNode;
import zhy2002.neutron.core.ParentUiNode;
import zhy2002.neutron.core.config.MetadataRegistry;
import zhy2002.neutron.core.config.PropertyMetadata;
import zhy2002.neutron.core.data.NodeIdentity;
import zhy2002.neutron.core.data.StringOption;

import java.util.Arrays;

/**
 * String leaf node.
 */
public abstract class StringUiNode<P extends ParentUiNode<?>> extends LeafUiNode<P, String> {

    protected StringUiNode(P parent) {
        super(parent);
    }

    @Override
    public String getEmptyValue() {
        return "";
    }

    @Override
    public Class<String> getValueClass() {
        return String.class;
    }

    @Override
    public PropertyMetadata<String> getValuePropertyMetadata() {
        return VALUE_PROPERTY;
    }

    @Override
    protected void clearNodeIdentity() {
        NodeIdentity nodeIdentity = getNodeIdentity();
        if (nodeIdentity != null) {
            setValue(nodeIdentity.getValue());
        }

        super.clearNodeIdentity();
    }

    //region node properties

    public static final PropertyMetadata<String> VALUE_PROPERTY = MetadataRegistry.createProperty(StringUiNode.class, "value", String.class, "", ChangeTrackingModeEnum.Value);
    @JsIgnore
    public static final PropertyMetadata<String> PATTERN_PROPERTY = MetadataRegistry.createProperty(StringUiNode.class, "pattern", String.class);
    @JsIgnore
    public static final PropertyMetadata<String> INVALID_CHARS_PROPERTY = MetadataRegistry.createProperty(StringUiNode.class, "invalidChars", String.class);
    @JsIgnore
    public static final PropertyMetadata<String> PATTERN_MESSAGE_PROPERTY = MetadataRegistry.createProperty(StringUiNode.class, "patternMessage", String.class, "Pattern is invalid.");
    public static final PropertyMetadata<String> INVALID_CHARS_MESSAGE_PROPERTY = MetadataRegistry.createProperty(StringUiNode.class, "invalidCharsMessage", String.class, "Cannot contain invalid chars.");
    public static final PropertyMetadata<String> LENGTH_MESSAGE_PROPERTY = MetadataRegistry.createProperty(StringUiNode.class, "lengthMessage", String.class, "{label} must have {min} to {max} characters.");
    public static final PropertyMetadata<Integer> MIN_LENGTH_PROPERTY = MetadataRegistry.createProperty(StringUiNode.class, "minLength", Integer.class);
    public static final PropertyMetadata<Integer> MAX_LENGTH_PROPERTY = MetadataRegistry.createProperty(StringUiNode.class, "maxLength", Integer.class, 255);

    @JsMethod
    @Override
    public final String getValue() {
        return super.getStateValue(VALUE_PROPERTY);
    }

    @JsMethod
    @Override
    public final void setValue(String value) {
        super.setStateValue(VALUE_PROPERTY, value);
    }

    public String getPattern() {
        return super.getStateValue(PATTERN_PROPERTY);
    }

    public void setPattern(String value) {
        super.setStateValue(PATTERN_PROPERTY, value);
    }

    public String getPatternMessage() {
        return getStateValue(PATTERN_MESSAGE_PROPERTY);
    }

    public void setPatternMessage(String message) {
        setStateValue(PATTERN_MESSAGE_PROPERTY, message);
    }

    public Integer getMinLength() {
        return super.getStateValue(MIN_LENGTH_PROPERTY);
    }

    public void setMinLength(Integer length) {
        super.setStateValue(MIN_LENGTH_PROPERTY, length);
    }

    public Integer getMaxLength() {
        return super.getStateValue(MAX_LENGTH_PROPERTY);
    }

    public void setMaxLength(Integer length) {
        super.setStateValue(MAX_LENGTH_PROPERTY, length);
    }

    public String getLengthMessage() {
        return getStateValue(LENGTH_MESSAGE_PROPERTY);
    }

    public void setLengthMessage(String message) {
        setStateValue(LENGTH_MESSAGE_PROPERTY, message);
    }

    public String getInvalidChars() {
        return super.getStateValue(INVALID_CHARS_PROPERTY);
    }

    public void setInvalidChars(String invalidChars) {
        super.setStateValue(INVALID_CHARS_PROPERTY, invalidChars);
    }

    public String getInvalidCharsMessage() {
        return getStateValue(INVALID_CHARS_MESSAGE_PROPERTY);
    }

    public void setInvalidCharsMessage(String message) {
        setStateValue(INVALID_CHARS_MESSAGE_PROPERTY, message);
    }

    @SuppressWarnings("unusable-by-js")
    @JsMethod
    public StringOption[] getOptions() {
        StringOption[] options = (StringOption[]) getStateValue(OPTIONS_PROPERTY);
        StringOption[] result = null;
        if (options != null) {
            result = Arrays.copyOf(options, options.length);
        }
        return result;
    }

    @SuppressWarnings("unusable-by-js")
    @JsMethod
    public void setOptions(StringOption[] value) {
        setStateValue(OPTIONS_PROPERTY, value);
    }

    //endregion

}
