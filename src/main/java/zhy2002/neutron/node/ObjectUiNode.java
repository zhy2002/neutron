package zhy2002.neutron.node;

import jsinterop.annotations.JsType;
import zhy2002.neutron.UiNodeContext;

import javax.validation.constraints.NotNull;

/**
 * A ParentUiNode whose children are exposed as properties.
 */
@JsType
public abstract class ObjectUiNode<P extends ParentUiNode<?>> extends ParentUiNode<P> {

    protected ObjectUiNode(@NotNull P parent, @NotNull String name) {
        super(parent, name);
    }

    protected ObjectUiNode(@NotNull UiNodeContext<?> context) {
        super(context);
    }

    @Override
    protected void initializeChildren() {
        addChildren();
        loadChildren();
    }

    protected abstract void addChildren();

    protected abstract void loadChildren();

    @Override
    protected void undoInitializeSelf() {
        throw new NotImplementedException();
    }

    @Override
    protected void undoInitializeChildren() {
        throw new NotImplementedException();
    }

}
