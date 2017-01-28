package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class SavingsAccountNameNodeFactory implements ChildNodeFactory<SavingsAccountNameNode, SavingsAccountNode> {

    @Override
    public SavingsAccountNameNode create(SavingsAccountNode parent, String name) {
        return new SavingsAccountNameNode(parent, name);
    }
}
