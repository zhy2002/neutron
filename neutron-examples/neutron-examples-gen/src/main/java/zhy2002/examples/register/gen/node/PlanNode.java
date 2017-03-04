package zhy2002.examples.register.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.math.*;
import zhy2002.examples.register.data.*;
import zhy2002.examples.register.gen.rule.*;
import zhy2002.examples.register.gen.di.*;


public class PlanNode extends StringUiNode<RegisterNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return PlanNode.class;
    }

    private PlanNodeComponent component;

    @Inject
    void createComponent(PlanNodeComponent.Builder builder) {
        this.component = builder.setPlanNodeModule(new PlanNodeModule(this)).build();
    }

    @Override
    protected PlanNodeRuleProvider getRuleProvider() {
        return component.getPlanNodeRuleProvider();
    }

    @Override
    protected void initializeRuleState() {
        getRuleProvider().initializeState(this);
    }


    public PlanNode(@NotNull RegisterNode parent, String name) {
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
