package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class PersonSignificantChangeFlagNodeFactory implements ChildNodeFactory<PersonSignificantChangeFlagNode, PersonResponsibleLendNode> {

    @Override
    public PersonSignificantChangeFlagNode create(PersonResponsibleLendNode parent, String name) {
        return new PersonSignificantChangeFlagNode(parent, name);
    }
}
