package zhy2002.examples.register.gen;


import zhy2002.examples.register.gen.data.ProductPlan;
import zhy2002.neutron.node.StringUiNode;

public class PlanNode extends StringUiNode<RegisterNode> {

    PlanNode(RegisterNode parent, String name) {
        super(parent, name);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setOptions(new ProductPlan[0]);
    }

    public void setOptions(Object options) {
        setStateValue("plans", Object.class, options);
    }

}
