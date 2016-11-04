package zhy2002.neutron.anz.loanapplication.brokerdetails.addresses;

import zhy2002.neutron.anz.common.addresses.BaseAddressesNode;
import zhy2002.neutron.anz.loanapplication.brokerdetails.BrokerDetailsNode;
import zhy2002.neutron.uinode.UiNodeContext;

/**
 * Created by ZHY on 22/10/2016.
 */
public class AddressesNode extends BaseAddressesNode<BrokerDetailsNode, AddressNode> {

    protected AddressesNode(BrokerDetailsNode parent) {
        super(parent);
    }

    protected AddressesNode(UiNodeContext context) {
        super(context);
    }
}
