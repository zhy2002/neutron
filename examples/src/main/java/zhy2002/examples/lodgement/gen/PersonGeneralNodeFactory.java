package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class PersonGeneralNodeFactory implements ChildNodeFactory<PersonGeneralNode, PersonNode> {

    @Override
    public PersonGeneralNode create(PersonNode parent, String name) {
        return new PersonGeneralNode(parent, name);
    }
}
