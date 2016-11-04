package zhy2002.neutron.anz.common.addresses.stdaddress;

import zhy2002.neutron.anz.common.addresses.BaseAddressNode;
import zhy2002.neutron.uinode.CompositeUiNode;
import zhy2002.neutron.uinode.UiNodeContext;

/**
 * Created by ZHY on 23/10/2016.
 */
public abstract class BaseStdAddressNode<P extends BaseAddressNode<?, ?>> extends CompositeUiNode<P> {


    protected BaseStdAddressNode(P parent) {
        super(parent);
    }

    protected BaseStdAddressNode(UiNodeContext context) {
        super(context);
    }
}
