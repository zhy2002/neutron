package zhy2002.examples.register.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.register.gen.rule.*;
import zhy2002.examples.register.gen.di.*;
import java.util.List;


public class OwnInvestmentPropertyNode extends BooleanUiNode<RegisterNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return OwnInvestmentPropertyNode.class;
    }

    private OwnInvestmentPropertyNodeComponent component;

    @Inject
    void createComponent(OwnInvestmentPropertyNodeComponent.Builder builder) {
        this.component = builder.setOwnInvestmentPropertyNodeModule(new OwnInvestmentPropertyNodeModule(this)).build();
    }

    private OwnInvestmentPropertyNodeRuleProvider getRuleProvider() {
        return component.getOwnInvestmentPropertyNodeRuleProvider();
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

    private RuleProvider<OwnInvestmentPropertyNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

    public OwnInvestmentPropertyNode(@NotNull RegisterNode parent, String name) {
        super(parent, name);
    }

}
