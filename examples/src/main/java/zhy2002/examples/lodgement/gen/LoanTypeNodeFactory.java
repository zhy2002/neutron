package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class LoanTypeNodeFactory implements ChildNodeFactory<LoanTypeNode, LoanNode> {

    @Override
    public LoanTypeNode create(LoanNode parent, String name) {
        return new LoanTypeNode(parent, name);
    }
}
