package zhy2002.neutron.anz.loanapplication.brokerdetails.addresses.towncity;

import zhy2002.neutron.anz.common.addresses.towncity.BaseTownCityNode;
import zhy2002.neutron.anz.loanapplication.brokerdetails.addresses.AddressNode;
import zhy2002.neutron.uinode.UiNodeContext;

/**
 * Created by ZHY on 23/10/2016.
 */
public class TownCityNode extends BaseTownCityNode<AddressNode> {

    protected TownCityNode(AddressNode parent) {
        super(parent);
    }

    protected TownCityNode(UiNodeContext context) {
        super(context);
    }
}
