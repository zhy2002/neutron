package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class PreviousEmploymentNodeFactory implements ChildNodeFactory<PreviousEmploymentNode, PreviousEmploymentListNode> {

    @Override
    public PreviousEmploymentNode create(PreviousEmploymentListNode parent, String name) {
        return new PreviousEmploymentNode(parent, name);
    }
}
