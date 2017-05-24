package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class ProfitThisYearNode extends BigDecimalUiNode<SelfEmployedNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return ProfitThisYearNode.class;
    }

    private ProfitThisYearNodeComponent component;

    @Inject
    void createComponent(ProfitThisYearNodeComponent.Builder builder) {
        this.component = builder.setProfitThisYearNodeModule(new ProfitThisYearNodeModule(this)).build();
    }

    private RuleProvider<ProfitThisYearNode> getRuleProvider() {
        return component.getProfitThisYearNodeRuleProvider();
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

    private RuleProvider<ProfitThisYearNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }


    public ProfitThisYearNode(@NotNull SelfEmployedNode parent, String name) {
        super(parent, name);
    }

}
