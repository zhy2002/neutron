package zhy2002.neutron.anz.loanapplication.brokerdetails;

import zhy2002.neutron.anz.loanapplication.LoanApplicationNode;
import zhy2002.neutron.uinode.factoryregistry.UiNodeFactory;

/**
 * Created by john.zhang on 28/10/2016.
 */
public class BrokerDetailsNodeFactory extends UiNodeFactory<BrokerDetailsNode, LoanApplicationNode> {

    public BrokerDetailsNode create(LoanApplicationNode parent) {

        BrokerDetailsNode node = new BrokerDetailsNode(parent);
        return node;
    }
}
