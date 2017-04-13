package zhy2002.neutron.node;

import jsinterop.annotations.JsMethod;
import zhy2002.neutron.ChangeModeEnum;
import zhy2002.neutron.LeafUiNode;
import zhy2002.neutron.ParentUiNode;
import zhy2002.neutron.UiNode;
import zhy2002.neutron.config.MetadataRegistry;
import zhy2002.neutron.config.PropertyMetadata;

import javax.validation.constraints.NotNull;

import static zhy2002.neutron.util.NeutronEventSubjects.REMOVE_EMPTY;

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

    @JsMethod
    @Override
    public final String getValue() {
        return super.getValue();
    }

    @JsMethod
    @Override
    public final void setValue(String value) {
        super.setValue(String.class, value);
    }

    //region node properties

    public static final PropertyMetadata<Boolean> REMOVE_EMPTY_PROPERTY = MetadataRegistry.createProperty(ReferenceUiNode.class, "removeEmpty", Boolean.class, Boolean.FALSE, ChangeModeEnum.DIRECT);

    public final boolean isRemoveEmpty() {
        return getStateValue(REMOVE_EMPTY_PROPERTY);
    }

    public final void setRemoveEmpty(boolean value) {
        setStateValue(REMOVE_EMPTY_PROPERTY, value);
    }

    //endregion



}
