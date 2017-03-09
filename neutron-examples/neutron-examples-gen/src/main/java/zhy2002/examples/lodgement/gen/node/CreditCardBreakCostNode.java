package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class CreditCardBreakCostNode extends BaseCurrencyNode<CreditCardNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return CreditCardBreakCostNode.class;
    }

    private CreditCardBreakCostNodeComponent component;

    @Inject
    void createComponent(CreditCardBreakCostNodeComponent.Builder builder) {
        this.component = builder.setCreditCardBreakCostNodeModule(new CreditCardBreakCostNodeModule(this)).build();
    }

    private CreditCardBreakCostNodeRuleProvider getRuleProvider() {
        return component.getCreditCardBreakCostNodeRuleProvider();
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

    private RuleProvider<CreditCardBreakCostNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

    public CreditCardBreakCostNode(@NotNull CreditCardNode parent, String name) {
        super(parent, name);
    }

}
