package zhy2002.neutron.node;

import jsinterop.annotations.JsMethod;
import zhy2002.neutron.ChangeModeEnum;
import zhy2002.neutron.LeafUiNode;
import zhy2002.neutron.ParentUiNode;
import zhy2002.neutron.UiNode;
import zhy2002.neutron.config.MetadataRegistry;
import zhy2002.neutron.config.PropertyMetadata;

import javax.validation.constraints.NotNull;

public abstract class ReferenceUiNode<P extends ParentUiNode<?>> extends LeafUiNode<P, String> {

    protected ReferenceUiNode(@NotNull P parent, @NotNull String name) {
        super(parent, name);
    }

    @JsMethod
    public UiNode<?> getReferencedNode() {
        return getContext().getNodeFinder().findNodeByPath(getValue());
    }

    @Override
    public Class<String> getValueClass() {
        return String.class;
    }

    //region node properties

    public static final PropertyMetadata<String> VALUE_PROPERTY = MetadataRegistry.createProperty(ReferenceUiNode.class, "value", String.class);
    public static final PropertyMetadata<Boolean> REMOVE_EMPTY_PROPERTY = MetadataRegistry.createProperty(ReferenceUiNode.class, "removeEmpty", Boolean.class, Boolean.FALSE, ChangeModeEnum.DIRECT);

    @JsMethod
    @Override
    public String getValue() {
        return getStateValue(VALUE_PROPERTY);
    }

    @JsMethod
    @Override
    public void setValue(String value) {
        setStateValue(VALUE_PROPERTY, value);
    }

    public final boolean isRemoveEmpty() {
        return getStateValue(REMOVE_EMPTY_PROPERTY);
    }

    public final void setRemoveEmpty(boolean value) {
        setStateValue(REMOVE_EMPTY_PROPERTY, value);
    }

    //endregion
}
