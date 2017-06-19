package zhy2002.neutron;

import jsinterop.annotations.JsMethod;
import zhy2002.neutron.config.MetadataRegistry;
import zhy2002.neutron.config.PropertyMetadata;
import zhy2002.neutron.data.NodeIdentity;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

/**
 * A ParentUiNode whose children are exposed as properties.
 */
public abstract class ObjectUiNode<P extends ParentUiNode<?>> extends ParentUiNode<P> {

    protected ObjectUiNode(@NotNull P parent) {
        super(parent);
    }

    protected ObjectUiNode(@NotNull UiNodeContext<?> context) {
        super(context);
    }

    @Override
    protected final void addContent() {
        List<UiNode<?>> children = createChildren();
        for (int i = 0; i < children.size(); i++) {
            UiNode<?> child = children.get(i);
            child.addToParent();
            child.setIndex(i);
        }

        super.addContent();
    }

    @Override
    protected final void loadContent() {
        for (UiNode<?> child : getChildren()) {
            if (child.getLoadWithParent()) {
                child.loadDirectly();
            }
        }

        super.loadContent();
    }

    /**
     * Only call this method at compound field level.
     * @return true if any child has value.
     */
    @Override
    public final boolean hasValue() {
        for (int i = 0; i < getChildCount(); i++) {
            if (getChild(i).hasValue())
                return true;
        }
        return false;
    }

    @Override
    public final void resetValue() {
        if (getNodeStatus() != NodeStatusEnum.Loaded)
            return;

        for (int i = 0; i < getChildCount(); i++) {
            getChild(i).resetValue();
        }
    }

    @JsMethod
    @Override
    public final int getChildCount() {
        return super.getChildCount();
    }

    protected
    @NotNull
    List<UiNode<?>> createChildren() {
        return new ArrayList<>();
    }

    @JsMethod
    public UiNode<?> getChildByName(String name) {
        return super.getChild(name);
    }

    //region node properties

    public static final PropertyMetadata<String> SELECTED_NAME_PROPERTY = MetadataRegistry.createProperty(ObjectUiNode.class, "selectedName", String.class, ChangeTrackingModeEnum.Value);

    @JsMethod
    public String getSelectedName() {
        return getStateValue(SELECTED_NAME_PROPERTY);
    }

    @JsMethod
    public void setSelectedName(String value) {
        setStateValue(SELECTED_NAME_PROPERTY, value);
    }

    protected void setChildNodeIdentity(String childName) {
        NodeIdentity childNodeIdentity = null;
        NodeIdentity nodeIdentity = getNodeIdentity();
        if (nodeIdentity != null && childName != null) {
            assert nodeIdentity.getNodeIdentityMap() != null;
            childNodeIdentity = nodeIdentity.getNodeIdentityMap().get(childName);
        }
        getContext().setNodeIdentity(childNodeIdentity);
        setNameOfChildBeingCreated(childName);
    }

    //endregion
}
