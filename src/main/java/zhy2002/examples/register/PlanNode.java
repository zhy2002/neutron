package zhy2002.examples.register;


import zhy2002.examples.register.data.ProductPlan;
import zhy2002.neutron.node.StringUiNode;

import java.util.ArrayList;
import java.util.List;

public class PlanNode extends StringUiNode<RegisterNode> {

    PlanNode(RegisterNode parent, String name) {
        super(parent, name);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setOptions(new ArrayList<>());
    }

    public void setOptions(List<ProductPlan> options) {
        ProductPlan[] plans = new ProductPlan[options.size()];
        options.toArray(plans);
        setStateValue("plans", Object.class, plans);
    }

}
