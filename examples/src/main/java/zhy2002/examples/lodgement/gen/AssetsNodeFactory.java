package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class AssetsNodeFactory implements ChildNodeFactory<AssetsNode, FinancialPositionNode> {

    @Override
    public AssetsNode create(FinancialPositionNode parent, String name) {
        return new AssetsNode(parent, name);
    }
}
