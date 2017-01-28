package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class LoanLenderNameNodeFactory implements ChildNodeFactory<LoanLenderNameNode, LoanNode> {

    @Override
    public LoanLenderNameNode create(LoanNode parent, String name) {
        return new LoanLenderNameNode(parent, name);
    }
}
