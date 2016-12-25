package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.ChildNodeFactory;

public class ApplicantTypeNodeFactory implements ChildNodeFactory<ApplicantTypeNode, PersonNode> {

    @Override
    public ApplicantTypeNode create(PersonNode parent, String name) {
        return new ApplicantTypeNode(parent, name);
    }
}
