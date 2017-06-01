package zhy2002.neutron;

import jsinterop.annotations.JsMethod;
import zhy2002.neutron.config.MetadataRegistry;
import zhy2002.neutron.config.PropertyMetadata;
import zhy2002.neutron.data.NodeIdentity;
import zhy2002.neutron.di.Owner;
import zhy2002.neutron.event.BooleanStateChangeEvent;
import zhy2002.neutron.event.BooleanStateChangeEventBinding;

import javax.inject.Inject;
import javax.validation.constraints.NotNull;
import java.util.*;

/**
 * A ParentUiNode whose children are exposed as properties.
 */
public abstract class ObjectUiNode<P extends ParentUiNode<?>> extends ParentUiNode<P> {

    protected ObjectUiNode(@NotNull P parent, @NotNull String name) {
        super(parent, name);
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

    @Override
    public final boolean hasValue() {
        return getHasValue();
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
        getContext().setNameOfNodeBeingCreated(childName);
    }

    //endregion

    /**
     * When any child becomes has_value mark this object node as has_value.
     * If all children becomes not has_value mark this object node as not has_value.
     */
    static class UpdateObjectHasValueRule extends UiNodeRule<ObjectUiNode<?>> {

        private final Set<String> noneEmptyChildNames = new HashSet<>();

        @Inject
        public UpdateObjectHasValueRule(@Owner ObjectUiNode<?> owner) {
            super(owner);
        }

        @Override
        protected Collection<EventBinding> createEventBindings() {
            return Arrays.asList(
                    new BooleanStateChangeEventBinding(
                            event -> event.getOrigin() != null && event.getOrigin().getParent() == getOwner(),
                            this::updateHasValue,
                            UiNode.HAS_VALUE_PROPERTY.getStateKey(),
                            PredefinedPhases.Post
                    )
            );
        }

        @Override
        protected void onLoad() {
            super.onLoad();

            if (getOwner().getParent() == null || getOwner().getParent().getNodeStatus() == NodeStatusEnum.Loaded) {
                if (initHasValue(getOwner()) && getOwner().getParent() instanceof ObjectUiNode) {
                    getOwner().getParent().setHasValue(true);
                }
            }
        }

        private boolean initHasValue(UiNode<?> node) {
            if (node instanceof LeafUiNode)
                return node.hasValue();

            ParentUiNode<?> parent = (ParentUiNode<?>) node;
            boolean childHasValue = false;
            for (int i = 0; i < parent.getChildCount(); i++) {
                UiNode<?> child = parent.getChild(i);
                if (initHasValue(child)) {
                    childHasValue = true;
                    noneEmptyChildNames.add(child.getName());
                }
            }

            if (parent instanceof ObjectUiNode) {
                parent.setStateValueDirectly(HAS_VALUE_PROPERTY.getStateKey(), childHasValue);
            }

            return parent.hasValue();
        }

        private void updateHasValue(BooleanStateChangeEvent event) {
            if (Boolean.TRUE.equals(event.getNewValue())) {
                noneEmptyChildNames.add(event.getOrigin().getName());
            } else {
                noneEmptyChildNames.remove(event.getOrigin().getName());
            }

            getOwner().setHasValue(!noneEmptyChildNames.isEmpty());
        }
    }
}
