package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class SavingsTypeNodeFactory implements ChildNodeFactory<SavingsTypeNode, SavingsAccountNode> {

    @Override
    public SavingsTypeNode create(SavingsAccountNode parent, String name) {
        return new SavingsTypeNode(parent, name);
    }
}
