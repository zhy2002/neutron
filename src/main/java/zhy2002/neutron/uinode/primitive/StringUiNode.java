package zhy2002.neutron.uinode.primitive;

import zhy2002.neutron.uinode.LeafUiNode;
import zhy2002.neutron.uinode.ParentUiNode;
import zhy2002.neutron.uinode.UiNodeContext;

/**
 * Created by ZHY on 23/10/2016.
 */
public class StringUiNode<P extends ParentUiNode<?>> extends LeafUiNode<P, String> {

    protected StringUiNode(P parent) {
        super(parent);
    }

    protected StringUiNode(UiNodeContext context) {
        super(context);
    }
}
