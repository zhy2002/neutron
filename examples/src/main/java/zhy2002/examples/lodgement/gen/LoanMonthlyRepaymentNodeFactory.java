package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class LoanMonthlyRepaymentNodeFactory implements ChildNodeFactory<LoanMonthlyRepaymentNode, LoanNode> {

    @Override
    public LoanMonthlyRepaymentNode create(LoanNode parent, String name) {
        return new LoanMonthlyRepaymentNode(parent, name);
    }
}
