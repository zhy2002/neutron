package zhy2002.neutron.anz.loanapplication.brokerdetails.companyname;

import zhy2002.neutron.anz.loanapplication.brokerdetails.BrokerDetailsNode;
import zhy2002.neutron.anz.loanapplication.brokerdetails.companyname.businessname.BusinessNameNode;
import zhy2002.neutron.uinode.CompositeUiNode;
import zhy2002.neutron.uinode.UiNodeContext;

/**
 * Created by ZHY on 22/10/2016.
 */
public class CompanyNameNode extends CompositeUiNode<BrokerDetailsNode> {

    private BusinessNameNode businessName;

    protected CompanyNameNode(BrokerDetailsNode parent) {
        super(parent);
    }

    protected CompanyNameNode(UiNodeContext context) {
        super(context);
    }
}
