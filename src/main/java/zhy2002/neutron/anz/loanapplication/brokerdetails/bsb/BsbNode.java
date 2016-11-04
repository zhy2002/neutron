package zhy2002.neutron.anz.loanapplication.brokerdetails.bsb;

import zhy2002.neutron.anz.common.bsb.BaseBsbNode;
import zhy2002.neutron.anz.loanapplication.brokerdetails.BrokerDetailsNode;
import zhy2002.neutron.uinode.UiNodeContext;

/**
 * Created by ZHY on 22/10/2016.
 */
public class BsbNode extends BaseBsbNode<BrokerDetailsNode> {

    protected BsbNode(BrokerDetailsNode parent) {
        super(parent);
    }

    protected BsbNode(UiNodeContext context) {
        super(context);
    }
}
