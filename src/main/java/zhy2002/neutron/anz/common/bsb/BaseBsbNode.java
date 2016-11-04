package zhy2002.neutron.anz.common.bsb;

import zhy2002.neutron.uinode.CompositeUiNode;
import zhy2002.neutron.uinode.UiNodeContext;
import zhy2002.neutron.uinode.primitive.StringUiNode;

/**
 * @param <P> type of the parent node class.
 */
public abstract class BaseBsbNode<P extends CompositeUiNode<?>> extends StringUiNode<P> {


    protected BaseBsbNode(P parent) {
        super(parent);
    }

    protected BaseBsbNode(UiNodeContext context) {
        super(context);
    }
}
