package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class ApplicantTypeNodeFactory implements ChildNodeFactory<ApplicantTypeNode, PersonGeneralNode> {

    @Override
    public ApplicantTypeNode create(PersonGeneralNode parent, String name) {
        return new ApplicantTypeNode(parent, name);
    }
}
