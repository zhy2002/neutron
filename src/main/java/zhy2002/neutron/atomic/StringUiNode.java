package zhy2002.neutron.atomic;

import zhy2002.neutron.LeafUiNode;
import zhy2002.neutron.ParentUiNode;
import zhy2002.neutron.UiNodeContext;

/**
 * String leaf node.
 */
public class StringUiNode<P extends ParentUiNode<?>> extends LeafUiNode<P, String> {

    protected StringUiNode(P parent, String name) {
        super(parent, name);
    }

    protected StringUiNode(UiNodeContext context) {
        super(context);
    }
}
