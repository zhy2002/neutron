package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class SavingsBsbNoNodeFactory implements ChildNodeFactory<SavingsBsbNoNode, SavingsAccountNode> {

    @Override
    public SavingsBsbNoNode create(SavingsAccountNode parent, String name) {
        return new SavingsBsbNoNode(parent, name);
    }
}
