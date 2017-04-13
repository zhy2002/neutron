package zhy2002.neutron;

import jsinterop.annotations.JsMethod;
import zhy2002.neutron.config.MetadataRegistry;
import zhy2002.neutron.config.PropertyMetadata;
import zhy2002.neutron.di.Owner;
import zhy2002.neutron.event.BooleanStateChangeEvent;
import zhy2002.neutron.event.BooleanStateChangeEventBinding;
import zhy2002.neutron.util.NeutronEventSubjects;

import javax.inject.Inject;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.util.logging.Logger;

/**
 * A UiNode that can have child UiNodes.
 * The two known subclasses are ObjectUiNode and ListUiNode.
 */
public abstract class ParentUiNode<P extends ParentUiNode<?>> extends UiNode<P> {

    private static final Logger logger = Logger.getLogger("ParentUiNode");

    /**
     * Support finding children by index.
     */
    private final List<UiNode<?>> children = new ArrayList<>();

    /**
     * Support finding children by name.
     */
    private final Map<String, UiNode<?>> childrenMap = new HashMap<>();

    protected ParentUiNode(@NotNull P parent, @NotNull String name) {
        super(parent, name);
    }

    protected ParentUiNode(@NotNull UiNodeContext<?> context) {
        super(context);
    }

    final int indexOf(UiNode<?> child) {
        return children.indexOf(child);
    }

    public final UiNode<?> getChild(String name) {
        return childrenMap.get(name);
    }

    final UiNode<?> getChild(int index) {
        return children.get(index);
    }

    protected void addChild(UiNode<?> child) {
        if (child.getParent() != this)
            throw new ParentMismatchException(this, child);
        if (childrenMap.get(child.getName()) != null)
            throw new ChildAlreadyExistException(this, child);

        children.add(child);
        childrenMap.put(child.getName(), child);
    }

    protected void removeChild(UiNode<?> child) {
        childrenMap.remove(child.getName());
        children.remove(child);
    }

    @JsMethod
    public final UiNode<?>[] getChildren() {
        UiNode<?>[] result = new UiNode[getChildCount()];
        this.children.toArray(result);
        return result;
    }

    protected int getChildCount() {
        return children.size();
    }

    @Override
    protected void unloadContent() {
        super.unloadContent();

        //todo do similar for leaf node
        if (getParent() != null && getParent().getNodeStatus() == NodeStatusEnum.Loaded) {
            int count = getDirtyDescendantCount();
            if (count > 0) {
                ParentUiNode<?> parent = getParent();
                do {
                    parent.setDirtyDescendantCount(parent.getDirtyDescendantCount() - count);
                    parent = parent.getParent();
                } while (parent != null);
            }
        }

        UiNode<?>[] children = getChildren();
        for (int i = children.length - 1; i >= 0; i--) {
            children[i].unload();
        }
    }

    @Override
    protected void removeContent() {
        super.removeContent();

        UiNode<?>[] children = getChildren();
        for (int i = children.length - 1; i >= 0; i--) {
            children[i].removeFromParent();
        }
    }

    @JsMethod
    public boolean hasError() {
        if (getValidationErrorList().size() > 0)
            return true;

        for (UiNode<?> child : children) {
            if (child instanceof ParentUiNode) {
                if (((ParentUiNode<?>) child).hasError())
                    return true;
            } else {
                if (child.getValidationErrorList().size() > 0)
                    return true;
            }
        }

        return false;
    }

    @JsMethod
    public void resetValidationState() {
        clearValidationErrors();
        for (UiNode<?> child : getChildren()) {
            if (child instanceof ParentUiNode) {
                ((ParentUiNode<?>) child).resetValidationState();
            } else {
                child.clearValidationErrors();
            }
        }
    }

    private void increaseDirtyDescendantCount() {
        setDirtyDescendantCount(getDirtyDescendantCount() + 1);
    }

    private void decreaseDirtyDescendantCount() {
        setDirtyDescendantCount(getDirtyDescendantCount() - 1);
    }

    @Override
    public boolean isDirty() {
        return getDirtyDescendantCount() > 0;
    }

    @Override
    protected void resetDirty() {
        clearStateValueDirectly(NeutronEventSubjects.DESCENDANT_DIRTY_COUNT);
    }

    public static class MaintainDirtyDescendantCountRule extends UiNodeRule<ParentUiNode<?>> {

        @Inject
        protected MaintainDirtyDescendantCountRule(@Owner ParentUiNode<?> owner) {
            super(owner);
        }

        @Override
        protected Collection<EventBinding> createEventBindings() {
            return Arrays.asList(
                    new BooleanStateChangeEventBinding(
                            e -> getContext().isDirtyCheckEnabled(),
                            this::updateCount,
                            Collections.singletonList(NeutronEventSubjects.SELF_DIRTY)
                    )
            );
        }

        private void updateCount(BooleanStateChangeEvent event) {
            if (Boolean.TRUE.equals(event.getNewValue()) && !Boolean.TRUE.equals(event.getOldValue())) {
                getOwner().increaseDirtyDescendantCount();
            } else if (!Boolean.TRUE.equals(event.getNewValue()) && Boolean.TRUE.equals(event.getOldValue())) {
                getOwner().decreaseDirtyDescendantCount();
            }
        }
    }

    @JsMethod
    public void selectDescendant(String path) {
        if (path == null) {
            return;
        }

        logger.info("selecting path: " + path);

        UiNode<?> parent = this;
        String[] names = path.split("/");
        for (String name : names) {
            if (parent instanceof ListUiNode<?, ?>) {
                ListUiNode<?, ?> list = (ListUiNode<?, ?>) parent;
                UiNode<?> child = list.getChild(name);
                if (child != null) {
                    list.setSelectedIndex(child.getIndex());
                    parent = child;
                }
            } else if (parent instanceof ObjectUiNode<?>) {
                ObjectUiNode<?> obj = (ObjectUiNode<?>) parent;
                UiNode<?> child = obj.getChild(name);
                if (child != null) {
                    obj.setSelectedName(child.getName());
                    parent = child;
                }
            } else {
                break;
            }
        }

        getContext().setContentLevel(names.length);
    }

    //region node properties

    public static final PropertyMetadata<Integer> DESCENDANT_DIRTY_COUNT_PROPERTY = MetadataRegistry.createProperty(ParentUiNode.class, "descendantDirtyCount", Integer.class, 0);

    private int getDirtyDescendantCount() {
        return getStateValue(DESCENDANT_DIRTY_COUNT_PROPERTY);
    }

    private void setDirtyDescendantCount(int count) {
        setStateValue(DESCENDANT_DIRTY_COUNT_PROPERTY, count);
    }

    //endregion

}
