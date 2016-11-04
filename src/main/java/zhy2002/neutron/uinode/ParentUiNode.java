package zhy2002.neutron.uinode;

/**
 * Common behaviour between {@see ListUiNode} and a {@see CompositeUiNode}.
 */
public abstract class ParentUiNode<P extends ParentUiNode<?>> extends UiNode<P> {

    protected ParentUiNode(P parent) {
        super(parent);
    }

    protected ParentUiNode(UiNodeContext context) {
        super(context);
    }
}
