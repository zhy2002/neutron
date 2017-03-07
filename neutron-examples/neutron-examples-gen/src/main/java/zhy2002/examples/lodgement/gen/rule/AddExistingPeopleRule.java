package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.node.*;


public abstract class AddExistingPeopleRule extends UiNodeRule<SelectRelatedPersonListNode<?>> {

    public AddExistingPeopleRule(SelectRelatedPersonListNode<?> owner) {
        super(owner);
    }

    protected SelectRelatedPersonListNode<?> getSelectRelatedPersonListNode() {
        return getOwner();
    }
}
