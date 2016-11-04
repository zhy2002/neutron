package zhy2002.neutron.anz.loanapplication.brokerdetails.addresses.stdaddress;

import zhy2002.neutron.anz.common.addresses.stdaddress.BaseStdAddressNode;
import zhy2002.neutron.anz.loanapplication.brokerdetails.addresses.AddressNode;
import zhy2002.neutron.uinode.UiNodeContext;

/**
 * Created by ZHY on 23/10/2016.
 */
public class StdAddressNode extends BaseStdAddressNode<AddressNode> {
    protected StdAddressNode(AddressNode parent) {
        super(parent);
    }

    protected StdAddressNode(UiNodeContext context) {
        super(context);
    }
}
