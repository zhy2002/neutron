package zhy2002.neutron.anz.loanapplication.brokerdetails;

import zhy2002.neutron.anz.loanapplication.LoanApplicationNode;
import zhy2002.neutron.anz.loanapplication.brokerdetails.addresses.AddressesNode;
import zhy2002.neutron.anz.loanapplication.brokerdetails.personname.PersonNameNode;
import zhy2002.neutron.uinode.CompositeUiNode;
import zhy2002.neutron.uinode.UiNodeContext;

/**
 * Created by ZHY on 22/10/2016.
 */
public class BrokerDetailsNode extends CompositeUiNode<LoanApplicationNode> {

    private PersonNameNode personName;
    private AddressesNode addressesNode;

    protected BrokerDetailsNode(LoanApplicationNode parent) {
        super(parent);
    }

    protected BrokerDetailsNode(UiNodeContext context) {
        super(context);
    }

    public PersonNameNode getPersonName() {
        return personName;
    }

    public AddressesNode getAddressesNode() {
        return addressesNode;
    }
}
