package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class SavingsBalanceNodeFactory implements ChildNodeFactory<SavingsBalanceNode, SavingsAccountNode> {

    @Override
    public SavingsBalanceNode create(SavingsAccountNode parent, String name) {
        return new SavingsBalanceNode(parent, name);
    }
}
