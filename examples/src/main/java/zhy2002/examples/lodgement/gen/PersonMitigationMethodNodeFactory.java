package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class PersonMitigationMethodNodeFactory implements ChildNodeFactory<PersonMitigationMethodNode, PersonResponsibleLendNode> {

    @Override
    public PersonMitigationMethodNode create(PersonResponsibleLendNode parent, String name) {
        return new PersonMitigationMethodNode(parent, name);
    }
}
