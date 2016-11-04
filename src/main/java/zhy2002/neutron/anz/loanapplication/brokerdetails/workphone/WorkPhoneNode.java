package zhy2002.neutron.anz.loanapplication.brokerdetails.workphone;

import zhy2002.neutron.anz.loanapplication.brokerdetails.BrokerDetailsNode;
import zhy2002.neutron.uinode.CompositeUiNode;
import zhy2002.neutron.uinode.UiNodeContext;

//[convention] Child node type knows its exact parent node type. Parent node type does not need to know exact child type.

/**
 * Created by ZHY on 22/10/2016.
 */
public class WorkPhoneNode extends CompositeUiNode<BrokerDetailsNode> {

    protected WorkPhoneNode(BrokerDetailsNode parent) {
        super(parent);
    }

    protected WorkPhoneNode(UiNodeContext context) {
        super(context);
    }
}
