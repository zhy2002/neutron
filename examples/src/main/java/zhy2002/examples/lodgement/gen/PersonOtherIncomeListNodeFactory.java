package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class PersonOtherIncomeListNodeFactory implements ChildNodeFactory<PersonOtherIncomeListNode, PersonNode> {

    @Override
    public PersonOtherIncomeListNode create(PersonNode parent, String name) {
        return new PersonOtherIncomeListNode(parent, name);
    }
}
