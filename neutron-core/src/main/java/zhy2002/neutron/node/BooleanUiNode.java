package zhy2002.neutron.node;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;
import zhy2002.neutron.LeafUiNode;
import zhy2002.neutron.ParentUiNode;
import zhy2002.neutron.config.MetadataRegistry;
import zhy2002.neutron.config.PropertyMetadata;

import javax.validation.constraints.NotNull;

@JsType
public abstract class BooleanUiNode<P extends ParentUiNode<?>> extends LeafUiNode<P, Boolean> {

    protected BooleanUiNode(@NotNull P parent, @NotNull String name) {
        super(parent, name);
    }

    @Override
    public Class<Boolean> getValueClass() {
        return Boolean.class;
    }

    //region node properties

    public static final PropertyMetadata<Boolean> VALUE_PROPERTY = MetadataRegistry.createProperty(BooleanUiNode.class, "value", Boolean.class, Boolean.FALSE);
    public static final PropertyMetadata<Boolean> FIXED_VALUE_PROPERTY = MetadataRegistry.createProperty(BooleanUiNode.class, "fixedValue", Boolean.class);

    @JsMethod
    @Override
    public Boolean getValue() {
        return getStateValue(VALUE_PROPERTY);
    }

    @JsMethod
    @Override
    public void setValue(Boolean value) {
        setStateValue(VALUE_PROPERTY, value);
    }

    public Boolean getFixedValue() {
        return getStateValue(FIXED_VALUE_PROPERTY);
    }

    public void setFixedValue(Boolean fixedValue) {
        setStateValue(FIXED_VALUE_PROPERTY, fixedValue);
    }

    //endregion
}
