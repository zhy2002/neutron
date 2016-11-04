package zhy2002.neutron.anz.loanapplication.brokerdetails.companyname.businessname;

import zhy2002.neutron.anz.loanapplication.brokerdetails.companyname.CompanyNameNode;
import zhy2002.neutron.uinode.UiNodeContext;
import zhy2002.neutron.uinode.primitive.StringUiNode;

/**
 * Created by john.zhang on 10/25/2016.
 */
public class BusinessNameNode extends StringUiNode<CompanyNameNode> {


    protected BusinessNameNode(CompanyNameNode parent) {
        super(parent);
    }

    protected BusinessNameNode(UiNodeContext context) {
        super(context);
    }
}
