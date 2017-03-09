package zhy2002.examples.register.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.register.data.*;
import zhy2002.examples.register.gen.rule.*;
import zhy2002.examples.register.gen.di.*;
import java.util.List;


public class AgeNode extends BigDecimalUiNode<RegisterNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return AgeNode.class;
    }

    private AgeNodeComponent component;

    @Inject
    void createComponent(AgeNodeComponent.Builder builder) {
        this.component = builder.setAgeNodeModule(new AgeNodeModule(this)).build();
    }

    private AgeNodeRuleProvider getRuleProvider() {
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

    public AgeNode(@NotNull RegisterNode parent, String name) {
        super(parent, name);
    }

}
