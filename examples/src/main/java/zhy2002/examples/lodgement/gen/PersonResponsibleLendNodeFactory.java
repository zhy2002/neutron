package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class PersonResponsibleLendNodeFactory implements ChildNodeFactory<PersonResponsibleLendNode, PersonNode> {

    @Override
    public PersonResponsibleLendNode create(PersonNode parent, String name) {
        return new PersonResponsibleLendNode(parent, name);
    }
}
