package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class PersonRepaymentDifficultyNodeFactory implements ChildNodeFactory<PersonRepaymentDifficultyNode, PersonResponsibleLendNode> {

    @Override
    public PersonRepaymentDifficultyNode create(PersonResponsibleLendNode parent, String name) {
        return new PersonRepaymentDifficultyNode(parent, name);
    }
}
