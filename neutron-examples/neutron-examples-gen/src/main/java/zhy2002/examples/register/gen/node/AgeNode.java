package zhy2002.examples.register.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.register.gen.di.AgeNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.register.data.*;
import zhy2002.examples.register.gen.rule.*;
import zhy2002.examples.register.gen.di.*;
import java.util.List;


public class AgeNode extends BigDecimalUiNode<RegisterNode> {

    @Inject
    public AgeNode(@Owner RegisterNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return AgeNode.class;
    }

    protected final AgeNodeComponent getComponent() {
        return component;
    }


    private AgeNodeComponent component;

    @Inject
    void createComponent(AgeNodeComponent.Builder builder) {
        this.component = builder.setAgeNodeModule(new AgeNodeModule(this)).build();
    }

    private RuleProvider<AgeNode> getRuleProvider() {
        return component.getAgeNodeRuleProvider();
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

    private RuleProvider<AgeNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
