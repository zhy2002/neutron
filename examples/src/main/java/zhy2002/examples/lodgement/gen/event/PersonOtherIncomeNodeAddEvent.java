package zhy2002.examples.lodgement.gen.event;

import zhy2002.examples.lodgement.gen.PersonOtherIncomeNode;
import zhy2002.neutron.NodeAddEvent;


public class PersonOtherIncomeNodeAddEvent extends NodeAddEvent<PersonOtherIncomeNode> {

    public PersonOtherIncomeNodeAddEvent(PersonOtherIncomeNode target) {
        super(target);
    }
}
