package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class PersonOtherIncomeNodeFactory implements ChildNodeFactory<PersonOtherIncomeNode, PersonOtherIncomeListNode> {

    @Override
    public PersonOtherIncomeNode create(PersonOtherIncomeListNode parent, String name) {
        return new PersonOtherIncomeNode(parent, name);
    }
}
