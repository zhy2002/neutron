package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class PersonOtherIncomePreviousYearNodeFactory implements ChildNodeFactory<PersonOtherIncomePreviousYearNode, PersonOtherIncomeNode> {

    @Override
    public PersonOtherIncomePreviousYearNode create(PersonOtherIncomeNode parent, String name) {
        return new PersonOtherIncomePreviousYearNode(parent, name);
    }
}
