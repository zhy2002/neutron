package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class LoanLimitAmountNodeFactory implements ChildNodeFactory<LoanLimitAmountNode, LoanNode> {

    @Override
    public LoanLimitAmountNode create(LoanNode parent, String name) {
        return new LoanLimitAmountNode(parent, name);
    }
}
