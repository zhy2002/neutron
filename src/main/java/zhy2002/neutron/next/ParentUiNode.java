package zhy2002.neutron.next;

import javax.validation.constraints.NotNull;

/**
 * A UiNode that can have child UiNodes.
 * The two known subclasses are ObjectUiNode and ListUiNode.
 * todo Consider adding MapUiNode which maps one UiNode to another.
 */
public abstract class ParentUiNode<P extends ParentUiNode<?>> extends UiNode<P> {

    protected ParentUiNode(@NotNull P parent) {
        super(parent);
    }

    protected ParentUiNode(@NotNull UiNodeContext context) {
        super(context);
    }
}
