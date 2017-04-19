package zhy2002.neutron.node;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;
import zhy2002.neutron.ChangeTrackingModeEnum;
import zhy2002.neutron.LeafUiNode;
import zhy2002.neutron.ParentUiNode;
import zhy2002.neutron.config.MetadataRegistry;
import zhy2002.neutron.config.PropertyMetadata;
import zhy2002.neutron.data.StringOption;
import zhy2002.neutron.util.NeutronEventSubjects;
import zhy2002.neutron.util.ValueUtil;

import java.util.Arrays;

/**
 * String leaf node.
 */
@JsType
public abstract class StringUiNode<P extends ParentUiNode<?>> extends LeafUiNode<P, String> {

    protected StringUiNode(P parent, String name) {
        super(parent, name);

        setChangeTrackingMode(NeutronEventSubjects.VALUE, ChangeTrackingModeEnum.Value);
        this.setValue("");
        this.setMaxLength(255);
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

    //region node properties

    public static final PropertyMetadata<String> VALUE_PROPERTY = MetadataRegistry.createProperty(StringUiNode.class, "value", String.class, "", ChangeTrackingModeEnum.Value);
    public static final PropertyMetadata<String> PATTERN_PROPERTY = MetadataRegistry.createProperty(StringUiNode.class, "pattern", String.class);
    public static final PropertyMetadata<String> INVALID_CHARS_PROPERTY = MetadataRegistry.createProperty(StringUiNode.class, "invalidChars", String.class);
    public static final PropertyMetadata<String> PATTERN_MESSAGE_PROPERTY = MetadataRegistry.createProperty(StringUiNode.class, "patternMessage", String.class, "Pattern is invalid.");
    public static final PropertyMetadata<String> INVALID_CHARS_MESSAGE_PROPERTY = MetadataRegistry.createProperty(StringUiNode.class, "invalidCharsMessage", String.class, "Cannot contain invalid chars.");
    public static final PropertyMetadata<String> LENGTH_MESSAGE_PROPERTY = MetadataRegistry.createProperty(StringUiNode.class, "lengthMessage", String.class, "Length is invalid.");
    public static final PropertyMetadata<Integer> MIN_LENGTH_PROPERTY = MetadataRegistry.createProperty(StringUiNode.class, "minLength", Integer.class);
    public static final PropertyMetadata<Integer> MAX_LENGTH_PROPERTY = MetadataRegistry.createProperty(StringUiNode.class, "maxLength", Integer.class);
    public static final PropertyMetadata<Object> OPTIONS_PROPERTY = MetadataRegistry.createProperty(StringUiNode.class, "options", Object.class);

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

    @JsMethod
    public StringOption[] getOptions() {
        StringOption[] options = (StringOption[]) getStateValue(OPTIONS_PROPERTY);
        StringOption[] result = null;
        if (options != null) {
            result = Arrays.copyOf(options, options.length);
        }
        return result;
    }

    @JsMethod
    public void setOptions(StringOption[] value) {
        setStateValue(OPTIONS_PROPERTY, value);
    }

    //endregion

}
