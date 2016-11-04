package zhy2002.neutron.anz.loanapplication.brokerdetails.personname;

import zhy2002.neutron.anz.common.personname.BasePersonNameNode;
import zhy2002.neutron.anz.loanapplication.brokerdetails.BrokerDetailsNode;
import zhy2002.neutron.anz.loanapplication.brokerdetails.personname.firstname.FirstNameNode;
import zhy2002.neutron.anz.loanapplication.brokerdetails.personname.surname.SurnameNode;
import zhy2002.neutron.uinode.UiNodeContext;

/**
 * Created by ZHY on 22/10/2016.
 */
public class PersonNameNode extends BasePersonNameNode<BrokerDetailsNode, PersonNameNode> {

    private FirstNameNode firstName;
    private SurnameNode surname;

    protected PersonNameNode(BrokerDetailsNode parent) {
        super(parent);
    }

    protected PersonNameNode(UiNodeContext context) {
        super(context);
    }

    @Override
    public FirstNameNode getFirstName() {
        return firstName;
    }

    @Override
    public SurnameNode getSurname() {
        return surname;
    }

}
