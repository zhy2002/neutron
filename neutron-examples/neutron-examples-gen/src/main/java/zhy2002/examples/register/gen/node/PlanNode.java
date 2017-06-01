package zhy2002.examples.register.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.register.gen.di.PlanNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.register.data.*;
import zhy2002.examples.register.gen.rule.*;
import zhy2002.examples.register.gen.di.*;
import java.util.List;


public class PlanNode extends StringUiNode<RegisterNode> {

    @Inject
    public PlanNode(@Owner RegisterNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return PlanNode.class;
    }

    protected final PlanNodeComponent getComponent() {
        return component;
    }


    private PlanNodeComponent component;

    @Inject
    void createComponent(PlanNodeComponent.Builder builder) {
        this.component = builder.setPlanNodeModule(new PlanNodeModule(this)).build();
    }

    @Override
    protected void initializeState() {
        this.component.provideRuleProviders().forEach(provider -> provider.initializeState(this));
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        this.component.provideRuleProviders().forEach(provider -> provider.createRules(createdRules));
    }

}
