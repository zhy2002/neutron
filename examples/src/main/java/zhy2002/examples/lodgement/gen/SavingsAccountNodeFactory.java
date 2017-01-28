package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class SavingsAccountNodeFactory implements ChildNodeFactory<SavingsAccountNode, SavingsAccountListNode> {

    @Override
    public SavingsAccountNode create(SavingsAccountListNode parent, String name) {
        return new SavingsAccountNode(parent, name);
    }
}
