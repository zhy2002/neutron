package zhy2002.examples.lodgement.gen.event;

import zhy2002.examples.lodgement.gen.node.PersonOtherIncomeNode;
import zhy2002.neutron.NodeRemoveEvent;


public class PersonOtherIncomeNodeRemoveEvent extends NodeRemoveEvent<PersonOtherIncomeNode> {
    public PersonOtherIncomeNodeRemoveEvent(PersonOtherIncomeNode target) {
        super(target);
    }
}