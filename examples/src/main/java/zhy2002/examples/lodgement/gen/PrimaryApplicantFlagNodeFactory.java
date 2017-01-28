package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class PrimaryApplicantFlagNodeFactory implements ChildNodeFactory<PrimaryApplicantFlagNode, PersonGeneralNode> {

    @Override
    public PrimaryApplicantFlagNode create(PersonGeneralNode parent, String name) {
        return new PrimaryApplicantFlagNode(parent, name);
    }
}
