package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class LoanNodeFactory implements ChildNodeFactory<LoanNode, LoanListNode> {

    @Override
    public LoanNode create(LoanListNode parent, String name) {
        return new LoanNode(parent, name);
    }
}
