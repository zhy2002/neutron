package zhy2002.neutron.uinode;

/**
 * Created by john.zhang on 1/11/2016.
 */
public class RootUiNode extends ParentUiNode<RootUiNode>{

    public RootUiNode(UiNodeContext context) {
        super(context);
    }

    @Override
    public RootUiNode getParent() {
        return null;
    }



}
