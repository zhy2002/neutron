package zhy2002.neutron.uinode;

/**
 * Created by ZHY on 22/10/2016.
 */
public abstract class CompositeUiNode<P extends ParentUiNode<?>> extends ParentUiNode<P> {

    private String uniqueId;

    protected CompositeUiNode(P parent) {
        super(parent);
    }

    protected CompositeUiNode(UiNodeContext context) {
        super(context);
    }
}
