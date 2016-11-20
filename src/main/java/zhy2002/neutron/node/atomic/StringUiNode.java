package zhy2002.neutron.node.atomic;

import jsinterop.annotations.JsType;
import zhy2002.neutron.UiNodeContext;
import zhy2002.neutron.node.LeafUiNode;
import zhy2002.neutron.node.ParentUiNode;

/**
 * String leaf node.
 */
@JsType
public abstract class StringUiNode<P extends ParentUiNode<?>> extends LeafUiNode<P, String> {

    protected StringUiNode(P parent, String name) {
        super(parent, name);
    }

    protected StringUiNode(UiNodeContext context) {
        super(context);
    }

}
