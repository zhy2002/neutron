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

}
