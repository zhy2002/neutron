package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.node.*;


public abstract class AddNewPersonRule extends UiNodeRule<SelectRelatedPersonListNode<?>> {

    public AddNewPersonRule(SelectRelatedPersonListNode<?> owner) {
        super(owner);
    }

    protected SelectRelatedPersonListNode<?> getSelectRelatedPersonListNode() {
        return getOwner();
    }
}
