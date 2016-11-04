package zhy2002.neutron.anz.loanapplication.brokerdetails.personname.surname;

import zhy2002.neutron.anz.common.personname.surname.BaseSurnameNode;
import zhy2002.neutron.anz.loanapplication.brokerdetails.personname.PersonNameNode;
import zhy2002.neutron.uinode.UiNodeContext;

/**
 * Created by ZHY on 23/10/2016.
 */
public class SurnameNode extends BaseSurnameNode<PersonNameNode> {

    protected SurnameNode(PersonNameNode parent) {
        super(parent);
    }

    protected SurnameNode(UiNodeContext context) {
        super(context);
    }
}
