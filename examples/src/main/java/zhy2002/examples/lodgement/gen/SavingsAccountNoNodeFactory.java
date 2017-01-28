package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class SavingsAccountNoNodeFactory implements ChildNodeFactory<SavingsAccountNoNode, SavingsAccountNode> {

    @Override
    public SavingsAccountNoNode create(SavingsAccountNode parent, String name) {
        return new SavingsAccountNoNode(parent, name);
    }
}
