package zhy2002.examples.register.gen;

import zhy2002.neutron.ChildNodeFactory;

public class PlanNodeFactory implements ChildNodeFactory<PlanNode, RegisterNode> {

    @Override
    public PlanNode create(RegisterNode parent, String name) {
        return new PlanNode(parent, name);
    }
}
