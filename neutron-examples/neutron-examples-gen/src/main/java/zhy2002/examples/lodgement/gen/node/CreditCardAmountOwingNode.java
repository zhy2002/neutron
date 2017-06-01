package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.CreditCardAmountOwingNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class CreditCardAmountOwingNode extends BaseCurrencyNode<CreditCardNode> {

    @Inject
    public CreditCardAmountOwingNode(@Owner CreditCardNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return CreditCardAmountOwingNode.class;
    }

    protected final CreditCardAmountOwingNodeComponent getComponent() {
        return component;
    }


    private CreditCardAmountOwingNodeComponent component;

    @Inject
    void createComponent(CreditCardAmountOwingNodeComponent.Builder builder) {
        this.component = builder.setCreditCardAmountOwingNodeModule(new CreditCardAmountOwingNodeModule(this)).build();
    }

    private RuleProvider<CreditCardAmountOwingNode> getRuleProvider() {
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

}
