package zhy2002.neutron;

import jsinterop.annotations.JsMethod;
import zhy2002.neutron.config.MetadataRegistry;
import zhy2002.neutron.config.PropertyMetadata;
import zhy2002.neutron.di.Owner;
import zhy2002.neutron.event.BooleanStateChangeEvent;
import zhy2002.neutron.event.BooleanStateChangeEventBinding;
import zhy2002.neutron.exception.ChildAlreadyExistException;
import zhy2002.neutron.exception.ParentMismatchException;

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

    protected ParentUiNode(@NotNull P parent) {
        super(parent);
    }

    protected ParentUiNode(@NotNull UiNodeContext<?> context) {
        super(context);
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
    protected final void unloadContent() {
        super.unloadContent();

        decreaseAncestorDirtyDescendantCount();

        UiNode<?>[] children = getChildren();
        for (int i = children.length - 1; i >= 0; i--) {
            children[i].unloadDirectly();
        }
    }

    private void decreaseAncestorDirtyDescendantCount() {
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
    }

    @Override
    protected final void removeContent() {
        super.removeContent();

        UiNode<?>[] children = getChildren();
        for (int i = children.length - 1; i >= 0; i--) {
            children[i].removeFromParent();
        }
    }

    @Override
    public final boolean hasError() {
        if (getValidationErrorList().size() > 0)
            return true;

        for (UiNode<?> child : children) {
            if (child.hasError())
                return true;
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

    @JsMethod
    public boolean selectDescendant(String path) {
        int level = 0;
        if (path == null) {
            return false;
        }

        logger.info("selecting path: " + path);

        //parsing
        final String[] select = new String[1];
        int queryStringStart = path.indexOf("?");
        if (queryStringStart >= 0) {
            String queryString = path.substring(queryStringStart + 1);
            path = path.substring(0, queryStringStart);
            String[] parameters = queryString.split("&");
            Arrays.stream(parameters).forEach(p -> {
                String[] parts = p.split("=");
                if (parts.length >= 2 && parts[0].equals("select")) {
                    select[0] = parts[1];
                }
            });
        }
        UiNode<?> parent = this;
        String[] names = path.split("/");
        List<String> allNames = new ArrayList<>(Arrays.asList(names));
        if (select[0] != null) {
            allNames.add(select[0]);
        }

        //selection
        for (String name : allNames) {
            if (parent instanceof ListUiNode<?, ?>) {
                ListUiNode<?, ?> list = (ListUiNode<?, ?>) parent;
                UiNode<?> child = list.getChild(name);
                parent = child;
                if (child == null)
                    break;
                list.setSelectedIndex(child.getIndex());
                level++;
            } else if (parent instanceof ObjectUiNode<?>) {
                ObjectUiNode<?> obj = (ObjectUiNode<?>) parent;
                UiNode<?> child = obj.getChild(name);
                parent = child;
                if (child == null)
                    break;
                obj.setSelectedName(child.getName());
                level++;
            } else {
                break;
            }
        }

        getContext().getRootNode().setContentLevel(Math.min(level, names.length));
        return level >= names.length;
    }

    final void increaseDirtyDescendantCount() {
        setDirtyDescendantCount(getDirtyDescendantCount() + 1);
    }

    final void decreaseDirtyDescendantCount() {
        setDirtyDescendantCount(getDirtyDescendantCount() - 1);
    }

    @Override
    public boolean isDirty() {
        return getDirtyDescendantCount() > 0;
    }

    @Override
    void resetDirty() {
        clearStateValueDirectly(DESCENDANT_DIRTY_COUNT_PROPERTY.getStateKey());
    }

    //region node properties

    public static final PropertyMetadata<Integer> DESCENDANT_DIRTY_COUNT_PROPERTY = MetadataRegistry.createProperty(ParentUiNode.class, "descendantDirtyCount", Integer.class, 0);
    public static final PropertyMetadata<String> NAME_OF_CHILD_BEING_CREATED_PROPERTY = MetadataRegistry.createProperty(ParentUiNode.class, "nameOfChildBeingCreated", String.class, null, ChangeModeEnum.DIRECT);

    int getDirtyDescendantCount() {
        return getStateValue(DESCENDANT_DIRTY_COUNT_PROPERTY);
    }

    void setDirtyDescendantCount(int count) {
        setStateValue(DESCENDANT_DIRTY_COUNT_PROPERTY, count);
    }

    String getNameOfChildBeingCreated() {
        return getStateValue(NAME_OF_CHILD_BEING_CREATED_PROPERTY);
    }

    protected void setNameOfChildBeingCreated(String name) {
        setStateValue(NAME_OF_CHILD_BEING_CREATED_PROPERTY, name);
    }

    //endregion

    /**
     * Increment dirty descendant count when a descendant node itself becomes dirty.
     * Decrement dirty descendant count when a descendant node itself becomes not dirty.
     */
    static class MaintainDirtyDescendantCountRule extends UiNodeRule<ParentUiNode<?>> {

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
                            SELF_DIRTY_PROPERTY.getStateKey()
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

}

