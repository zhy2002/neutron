package zhy2002.neutron.node;

import zhy2002.neutron.UiNodeContext;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * A UiNode that can have child UiNodes.
 * The two known subclasses are ObjectUiNode and ListUiNode.
 * todo Consider adding MapUiNode which maps one UiNode to another.
 */
public abstract class ParentUiNode<P extends ParentUiNode<?>> extends UiNode<P> {

    private final List<UiNode<?>> children = new ArrayList<>();
    private final Map<String, UiNode<?>> childrenMap = new HashMap<>();

    protected ParentUiNode(@NotNull P parent, @NotNull String name) {
        super(parent, name);
    }

    protected ParentUiNode(@NotNull UiNodeContext<?> context) {
        super(context);
    }

    public int indexOf(UiNode<?> child) {
        return children.indexOf(child);
    }

    protected UiNode<?> getChild(String name) {
        return childrenMap.get(name);
    }

    protected UiNode<?> getChild(int index) {
        return children.get(index);
    }

    public void addChild(UiNode<?> child) {
        if (child.getParent() != this)
            throw new ParentMismatchException(this, child);
        if (childrenMap.get(child.getName()) != null)
            throw new ChildAlreadyExistException(this, child);

        children.add(child);
        childrenMap.put(child.getName(), child);
    }

    public int getChildCount() {
        return children.size();
    }

    @Override
    protected void doLoad() {
        initializeSelf();
        initializeChildren();
    }

    /**
     * Set default value, add rules and place hooks in ancestors.
     */
    protected abstract void initializeSelf();

    /**
     * Create and load children.
     */
    protected abstract void initializeChildren();

    @Override
    protected void doUnload() {
        undoInitializeSelf();
        undoInitializeChildren();
    }

    protected abstract void undoInitializeSelf();

    protected abstract void undoInitializeChildren();

}
