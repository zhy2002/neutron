package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class PersonListNodeFactory implements ChildNodeFactory<PersonListNode, ApplicationNode> {

    @Override
    public PersonListNode create(ApplicationNode parent, String name) {
        return new PersonListNode(parent, name);
    }
}
