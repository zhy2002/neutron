package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class ProfitPreviousYearNodeFactory implements ChildNodeFactory<ProfitPreviousYearNode, SelfEmployedNode> {

    @Override
    public ProfitPreviousYearNode create(SelfEmployedNode parent, String name) {
        return new ProfitPreviousYearNode(parent, name);
    }
}
