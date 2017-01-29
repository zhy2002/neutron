package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class PersonTypeOfChangeNodeFactory implements ChildNodeFactory<PersonTypeOfChangeNode, PersonResponsibleLendNode> {

    @Override
    public PersonTypeOfChangeNode create(PersonResponsibleLendNode parent, String name) {
        return new PersonTypeOfChangeNode(parent, name);
    }
}
