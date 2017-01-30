package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class PersonOtherIncomeTypeNodeFactory implements ChildNodeFactory<PersonOtherIncomeTypeNode, PersonOtherIncomeNode> {

    @Override
    public PersonOtherIncomeTypeNode create(PersonOtherIncomeNode parent, String name) {
        return new PersonOtherIncomeTypeNode(parent, name);
    }
}
