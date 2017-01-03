package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class PrimaryApplicantFlagNodeFactory implements ChildNodeFactory<PrimaryApplicantFlagNode, GeneralNode> {

    @Override
    public PrimaryApplicantFlagNode create(GeneralNode parent, String name) {
        return new PrimaryApplicantFlagNode(parent, name);
    }
}
