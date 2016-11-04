package zhy2002.neutron.anz.common.addresses.state;

import zhy2002.neutron.anz.common.addresses.BaseAddressNode;
import zhy2002.neutron.uinode.UiNodeContext;
import zhy2002.neutron.uinode.primitive.StringUiNode;

/**
 * Created by ZHY on 23/10/2016.
 */
public abstract class BaseStateNode<P extends BaseAddressNode<?, ?>> extends StringUiNode<P> {
    protected BaseStateNode(P parent) {
        super(parent);
    }

    protected BaseStateNode(UiNodeContext context) {
        super(context);
    }
}
