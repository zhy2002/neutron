package zhy2002.neutron.anz.loanapplication.brokerdetails.mobilephone;

import zhy2002.neutron.anz.loanapplication.brokerdetails.BrokerDetailsNode;
import zhy2002.neutron.uinode.UiNodeContext;
import zhy2002.neutron.uinode.primitive.StringUiNode;

/**
 * Created by ZHY on 22/10/2016.
 */
public class MobilePhoneNode extends StringUiNode<BrokerDetailsNode> {

    protected MobilePhoneNode(BrokerDetailsNode parent) {
        super(parent);
    }

    protected MobilePhoneNode(UiNodeContext context) {
        super(context);
    }
}
