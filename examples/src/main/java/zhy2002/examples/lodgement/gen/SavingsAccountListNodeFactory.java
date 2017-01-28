package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class SavingsAccountListNodeFactory implements ChildNodeFactory<SavingsAccountListNode, AssetsNode> {

    @Override
    public SavingsAccountListNode create(AssetsNode parent, String name) {
        return new SavingsAccountListNode(parent, name);
    }
}
