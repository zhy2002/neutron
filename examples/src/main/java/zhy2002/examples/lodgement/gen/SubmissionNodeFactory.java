package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class SubmissionNodeFactory implements ChildNodeFactory<SubmissionNode, ApplicationNode> {

    @Override
    public SubmissionNode create(ApplicationNode parent, String name) {
        return new SubmissionNode(parent, name);
    }
}
