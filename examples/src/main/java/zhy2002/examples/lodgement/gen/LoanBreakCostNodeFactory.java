package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class LoanBreakCostNodeFactory implements ChildNodeFactory<LoanBreakCostNode, LoanNode> {

    @Override
    public LoanBreakCostNode create(LoanNode parent, String name) {
        return new LoanBreakCostNode(parent, name);
    }
}
