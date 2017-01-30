package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class PersonAddBackTypeNodeFactory implements ChildNodeFactory<PersonAddBackTypeNode, PersonOtherIncomeNode> {

    @Override
    public PersonAddBackTypeNode create(PersonOtherIncomeNode parent, String name) {
        return new PersonAddBackTypeNode(parent, name);
    }
}
