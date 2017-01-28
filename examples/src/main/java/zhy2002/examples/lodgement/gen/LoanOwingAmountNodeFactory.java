package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class LoanOwingAmountNodeFactory implements ChildNodeFactory<LoanOwingAmountNode, LoanNode> {

    @Override
    public LoanOwingAmountNode create(LoanNode parent, String name) {
        return new LoanOwingAmountNode(parent, name);
    }
}
