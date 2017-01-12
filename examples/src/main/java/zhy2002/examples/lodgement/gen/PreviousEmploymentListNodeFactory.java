package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class PreviousEmploymentListNodeFactory implements ChildNodeFactory<PreviousEmploymentListNode, PersonNode> {

    @Override
    public PreviousEmploymentListNode create(PersonNode parent, String name) {
        return new PreviousEmploymentListNode(parent, name);
    }
}
