package zhy2002.neutron.anz.loanapplication.brokerdetails.personname.firstname;

import zhy2002.neutron.anz.common.personname.firstname.BaseFirstNameNode;
import zhy2002.neutron.anz.loanapplication.brokerdetails.personname.PersonNameNode;
import zhy2002.neutron.uinode.UiNodeContext;

/**
 * Created by ZHY on 23/10/2016.
 */
public class FirstNameNode extends BaseFirstNameNode<PersonNameNode> {

    protected FirstNameNode(PersonNameNode parent) {
        super(parent);
    }

    protected FirstNameNode(UiNodeContext context) {
        super(context);
    }
}
