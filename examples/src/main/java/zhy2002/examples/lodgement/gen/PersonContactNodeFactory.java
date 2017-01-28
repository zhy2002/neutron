package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class PersonContactNodeFactory implements ChildNodeFactory<PersonContactNode, PersonNode> {

    @Override
    public PersonContactNode create(PersonNode parent, String name) {
        return new PersonContactNode(parent, name);
    }
}
