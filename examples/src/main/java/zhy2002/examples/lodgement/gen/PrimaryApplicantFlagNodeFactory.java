package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.ChildNodeFactory;

public class PrimaryApplicantFlagNodeFactory implements ChildNodeFactory<PrimaryApplicantFlagNode, PersonNode> {

    @Override
    public PrimaryApplicantFlagNode create(PersonNode parent, String name) {
        return new PrimaryApplicantFlagNode(parent, name);
    }
}
