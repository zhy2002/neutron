package zhy2002.neutron.anz.loanapplication.brokerdetails.workphone.phonenumber;

import zhy2002.neutron.anz.loanapplication.brokerdetails.workphone.WorkPhoneNode;
import zhy2002.neutron.uinode.UiNodeContext;
import zhy2002.neutron.uinode.primitive.StringUiNode;

/**
 * Created by john.zhang on 10/26/2016.
 */
public class PhoneNumberNode extends StringUiNode<WorkPhoneNode> {
    protected PhoneNumberNode(WorkPhoneNode parent) {
        super(parent);
    }

    protected PhoneNumberNode(UiNodeContext context) {
        super(context);
    }
}
