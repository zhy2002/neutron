package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class LiabilitiesNodeFactory implements ChildNodeFactory<LiabilitiesNode, FinancialPositionNode> {

    @Override
    public LiabilitiesNode create(FinancialPositionNode parent, String name) {
        return new LiabilitiesNode(parent, name);
    }
}
