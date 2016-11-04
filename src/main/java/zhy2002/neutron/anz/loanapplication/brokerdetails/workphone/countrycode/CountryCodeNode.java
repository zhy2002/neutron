package zhy2002.neutron.anz.loanapplication.brokerdetails.workphone.countrycode;

import zhy2002.neutron.anz.loanapplication.brokerdetails.workphone.WorkPhoneNode;
import zhy2002.neutron.uinode.UiNodeContext;
import zhy2002.neutron.uinode.primitive.StringUiNode;

/**
 * Created by john.zhang on 10/26/2016.
 */
public class CountryCodeNode extends StringUiNode<WorkPhoneNode> {
    protected CountryCodeNode(WorkPhoneNode parent) {
        super(parent);
    }

    protected CountryCodeNode(UiNodeContext context) {
        super(context);
    }
}
