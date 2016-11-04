package zhy2002.neutron.next;

import javax.validation.constraints.NotNull;

/**
 * A ParentUiNode whose children are exposed as properties.
 */
public class ObjectUiNode<P extends ParentUiNode<?>> extends ParentUiNode<P> {


    protected ObjectUiNode(@NotNull P parent) {
        super(parent);
    }

    protected ObjectUiNode(@NotNull UiNodeContext context) {
        super(context);
    }
}
