package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class ProfitThisYearNodeFactory implements ChildNodeFactory<ProfitThisYearNode, SelfEmployedNode> {

    @Override
    public ProfitThisYearNode create(SelfEmployedNode parent, String name) {
        return new ProfitThisYearNode(parent, name);
    }
}
