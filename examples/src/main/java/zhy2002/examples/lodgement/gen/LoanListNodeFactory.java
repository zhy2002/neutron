package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class LoanListNodeFactory implements ChildNodeFactory<LoanListNode, LiabilitiesNode> {

    @Override
    public LoanListNode create(LiabilitiesNode parent, String name) {
        return new LoanListNode(parent, name);
    }
}
