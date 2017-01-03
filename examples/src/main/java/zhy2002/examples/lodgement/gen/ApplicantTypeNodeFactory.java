package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class ApplicantTypeNodeFactory implements ChildNodeFactory<ApplicantTypeNode, GeneralNode> {

    @Override
    public ApplicantTypeNode create(GeneralNode parent, String name) {
        return new ApplicantTypeNode(parent, name);
    }
}
