package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class CreditCardAmountOwingNode extends BaseCurrencyNode<CreditCardNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return CreditCardAmountOwingNode.class;
    }

    private CreditCardAmountOwingNodeComponent component;

    @Inject
    void createComponent(CreditCardAmountOwingNodeComponent.Builder builder) {
        this.component = builder.setCreditCardAmountOwingNodeModule(new CreditCardAmountOwingNodeModule(this)).build();
    }

    private CreditCardAmountOwingNodeRuleProvider getRuleProvider() {
        return component.getCreditCardAmountOwingNodeRuleProvider();
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

    private RuleProvider<CreditCardAmountOwingNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

    public CreditCardAmountOwingNode(@NotNull CreditCardNode parent, String name) {
        super(parent, name);
    }

}
