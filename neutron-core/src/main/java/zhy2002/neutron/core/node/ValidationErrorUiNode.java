package zhy2002.neutron.core.node;

import jsinterop.annotations.JsIgnore;
import jsinterop.annotations.JsMethod;
import zhy2002.neutron.core.LeafUiNode;
import zhy2002.neutron.core.ParentUiNode;
import zhy2002.neutron.core.UiNode;
import zhy2002.neutron.core.UiNodeRule;
import zhy2002.neutron.core.config.MetadataRegistry;
import zhy2002.neutron.core.config.PropertyMetadata;
import zhy2002.neutron.core.data.ValidationError;

public abstract class ValidationErrorUiNode<P extends ParentUiNode<?>> extends LeafUiNode<P, ValidationError> {

    private static ValidationError EMPTY_VALUE = new ValidationError();

    public ValidationErrorUiNode(P parent) {
        super(parent);
    }

    @JsMethod
    public UiNode<?> getSource() {
        return getValue().getOrigin();
    }

    @JsMethod
    public void setSource(UiNode<?> value) {
        getValue().setOrigin(value);
    }

    @JsMethod
    public String getMessage() {
        return getValue().getMessage();
    }

    @JsMethod
    public void setMessage(String value) {
        getValue().setMessage(value);
    }

    @JsIgnore
    public UiNodeRule<?> getRule() {
        return getValue().getRule();
    }

    @JsIgnore
    public void setRule(UiNodeRule<?> value) {
        getValue().setRule(value);
    }

    @Override
    public ValidationError getEmptyValue() {
        return EMPTY_VALUE;
    }

    @Override
    public Class<ValidationError> getValueClass() {
        return ValidationError.class;
    }

    @Override
    public PropertyMetadata<ValidationError> getValuePropertyMetadata() {
        return VALUE_PROPERTY;
    }

    //region node properties

    public static final PropertyMetadata<ValidationError> VALUE_PROPERTY = MetadataRegistry.createProperty(ValidationError.class, "value", ValidationError.class, EMPTY_VALUE);

    @JsMethod
    @Override
    public ValidationError getValue() {
        return super.getStateValue(VALUE_PROPERTY);
    }

    @JsMethod
    @Override
    public void setValue(ValidationError value) {
        super.setStateValue(VALUE_PROPERTY, value);
    }

    //endregion

}
