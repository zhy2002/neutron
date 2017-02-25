package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.*;


public abstract class PersonOtherIncomeTypeChangeRule extends UiNodeRule<PersonOtherIncomeTypeNode> {

    public PersonOtherIncomeTypeChangeRule(PersonOtherIncomeTypeNode owner) {
        super(owner);
    }

    protected PersonOtherIncomeTypeNode getPersonOtherIncomeTypeNode() {
        return getOwner();
    }
}
