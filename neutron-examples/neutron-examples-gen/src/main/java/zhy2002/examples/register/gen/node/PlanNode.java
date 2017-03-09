package zhy2002.examples.register.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.register.data.*;
import zhy2002.examples.register.gen.rule.*;
import zhy2002.examples.register.gen.di.*;
import java.util.List;


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

    private PlanNodeRuleProvider getRuleProvider() {
        return component.getPlanNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
        getInstanceRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
        getInstanceRuleProvider().createRules(createdRules);
    }

    private RuleProvider<PlanNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

    public PlanNode(@NotNull RegisterNode parent, String name) {
        super(parent, name);
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
