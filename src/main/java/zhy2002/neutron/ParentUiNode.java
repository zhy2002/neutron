package zhy2002.neutron;

import jsinterop.annotations.JsMethod;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * A UiNode that can have child UiNodes.
 * The two known subclasses are ObjectUiNode and ListUiNode.
 */
public abstract class ParentUiNode<P extends ParentUiNode<?>> extends UiNode<P> {

    /**
     * Support find children by index.
     */
    private final List<UiNode<?>> children = new ArrayList<>();

    /**
     * Support find children by name.
     */
    private final Map<String, UiNode<?>> childrenMap = new HashMap<>();

    protected ParentUiNode(@NotNull P parent, @NotNull String name) {
        super(parent, name);
    }

    protected ParentUiNode(@NotNull AbstractUiNodeContext<?> context) {
        super(context);
    }

    int indexOf(UiNode<?> child) {
        return children.indexOf(child);
    }

    protected UiNode<?> getChild(String name) {
        return childrenMap.get(name);
    }

    protected UiNode<?> getChild(int index) {
        return children.get(index);
    }

    void addChild(UiNode<?> child) {
        if (child.getParent() != this)
            throw new ParentMismatchException(this, child);
        if (childrenMap.get(child.getName()) != null)
            throw new ChildAlreadyExistException(this, child);

        children.add(child);
        childrenMap.put(child.getName(), child);
    }

    void removeChild(UiNode<?> child) {
        childrenMap.remove(child.getName());
        children.remove(child);
    }

    @JsMethod
    public UiNode<?>[] getChildren() {
        UiNode<?>[] result = new UiNode[getChildCount()];
        this.children.toArray(result);
        return result;
    }

    protected int getChildCount() {
        return children.size();
    }

    @Override
    protected void doLoad() {
        super.doLoad();
        initializeChildren();
    }

    /**
     * Create and load children.
     */
    protected abstract void initializeChildren();

    @Override
    protected void doUnload() {
        super.doUnload();
        uninitializeChildren();
    }

    /**
     * Undo children creation and loading.
     */
    protected abstract void uninitializeChildren();

}
