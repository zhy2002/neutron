package zhy2002.neutron.anz.loanapplication.brokerdetails.addresses.country;

import zhy2002.neutron.anz.common.addresses.country.BaseCountryNode;
import zhy2002.neutron.anz.loanapplication.brokerdetails.addresses.AddressNode;
import zhy2002.neutron.uinode.UiNodeContext;

/**
 * Created by ZHY on 23/10/2016.
 */
public class CountryNode extends BaseCountryNode<AddressNode> {

    protected CountryNode(AddressNode parent) {
        super(parent);
    }

    protected CountryNode(UiNodeContext context) {
        super(context);
    }
}
