package zhy2002.neutron;

import jsinterop.annotations.JsMethod;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * A ParentUiNode whose children are exposed as properties.
 */
public abstract class ObjectUiNode<P extends ParentUiNode<?>> extends ParentUiNode<P> {

    protected ObjectUiNode(@NotNull P parent, @NotNull String name) {
        super(parent, name);
    }

    protected ObjectUiNode(@NotNull AbstractUiNodeContext<?> context) {
        super(context);
    }

    @Override
    protected void initializeChildren() {
        List<UiNode<?>> children = createChildren();
        children.forEach(UiNode::addToParent);
        children.forEach(node -> {
            if (node.getLoadWithParent()) {
                node.load();
            }
        });
    }

    @Override
    protected void uninitializeChildren() {
        UiNode<?>[] children = getChildren();
        for (int i = children.length - 1; i >= 0; i--) {
            children[i].unload();
        }
        for (int i = children.length - 1; i >= 0; i--) {
            children[i].removeFromParent();
        }
    }

    protected
    @NotNull
    abstract List<UiNode<?>> createChildren();

    @JsMethod
    @Override
    public int getChildCount() {
        return super.getChildCount();
    }
}
