package zhy2002.neutron;

import javax.validation.constraints.NotNull;

/**
 * A ParentUiNode whose children are exposed as properties.
 */
public abstract class ObjectUiNode<P extends ParentUiNode<?>> extends ParentUiNode<P> {


    protected ObjectUiNode(@NotNull P parent, @NotNull String name) {
        super(parent, name);
    }

    protected ObjectUiNode(@NotNull UiNodeContext context) {
        super(context);
    }
}
