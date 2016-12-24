package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.ChildNodeFactory;

public class PersonNodeFactory implements ChildNodeFactory<PersonNode, PersonListNode> {

    @Override
    public PersonNode create(PersonListNode parent, String name) {
        return new PersonNode(parent, name);
    }
}
