package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class FinancialPositionNodeFactory implements ChildNodeFactory<FinancialPositionNode, ApplicationNode> {

    @Override
    public FinancialPositionNode create(ApplicationNode parent, String name) {
        return new FinancialPositionNode(parent, name);
    }
}
