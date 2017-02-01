package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class PersonOtherIncomeDescriptionNodeFactory implements ChildNodeFactory<PersonOtherIncomeDescriptionNode, PersonOtherIncomeNode> {

    @Override
    public PersonOtherIncomeDescriptionNode create(PersonOtherIncomeNode parent, String name) {
        return new PersonOtherIncomeDescriptionNode(parent, name);
    }
}
