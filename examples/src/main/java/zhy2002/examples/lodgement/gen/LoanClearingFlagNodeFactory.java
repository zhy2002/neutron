package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class LoanClearingFlagNodeFactory implements ChildNodeFactory<LoanClearingFlagNode, LoanNode> {

    @Override
    public LoanClearingFlagNode create(LoanNode parent, String name) {
        return new LoanClearingFlagNode(parent, name);
    }
}
