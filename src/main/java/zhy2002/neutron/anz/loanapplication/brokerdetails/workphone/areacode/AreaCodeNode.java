package zhy2002.neutron.anz.loanapplication.brokerdetails.workphone.areacode;

import zhy2002.neutron.anz.loanapplication.brokerdetails.workphone.WorkPhoneNode;
import zhy2002.neutron.uinode.UiNodeContext;
import zhy2002.neutron.uinode.primitive.StringUiNode;

/**
 * Created by john.zhang on 10/26/2016.
 */
public class AreaCodeNode extends StringUiNode<WorkPhoneNode> {
    protected AreaCodeNode(WorkPhoneNode parent) {
        super(parent);
    }

    protected AreaCodeNode(UiNodeContext context) {
        super(context);
    }
}
