package zhy2002.neutron.anz.loanapplication.brokerdetails.addresses.state;

import zhy2002.neutron.anz.common.addresses.state.BaseStateNode;
import zhy2002.neutron.anz.loanapplication.brokerdetails.addresses.AddressNode;
import zhy2002.neutron.uinode.UiNodeContext;

/**
 * Created by ZHY on 23/10/2016.
 */
public class StateNode extends BaseStateNode<AddressNode> {
    protected StateNode(AddressNode parent) {
        super(parent);
    }

    protected StateNode(UiNodeContext context) {
        super(context);
    }
}
