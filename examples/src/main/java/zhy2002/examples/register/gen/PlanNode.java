package zhy2002.examples.register.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.data.*;
import zhy2002.neutron.util.*;
import jsinterop.annotations.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.math.*;
import zhy2002.examples.register.data.*;


public  class PlanNode extends StringUiNode<RegisterNode>
{
    protected PlanNode(RegisterNode parent, String name) {
        super(parent, name);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setOptions(new ProductPlan[0]);
    }

    @JsMethod
    public Object getOptions() {
        return getStateValue(RegisterNodeConstants.OPTIONS);
    }

    @JsMethod
    public void setOptions(Object value) {
        setStateValue(RegisterNodeConstants.OPTIONS, Object.class, value);
    }

}
