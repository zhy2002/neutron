package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.CreditCardBreakCostNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class CreditCardBreakCostNode extends BaseCurrencyNode<CreditCardNode> {

    @Inject
    public CreditCardBreakCostNode(@Owner CreditCardNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return CreditCardBreakCostNode.class;
    }

    protected final CreditCardBreakCostNodeComponent getComponent() {
        return component;
    }


    private CreditCardBreakCostNodeComponent component;

    @Inject
    void createComponent(CreditCardBreakCostNodeComponent.Builder builder) {
        this.component = builder.setCreditCardBreakCostNodeModule(new CreditCardBreakCostNodeModule(this)).build();
    }

    private RuleProvider<CreditCardBreakCostNode> getRuleProvider() {
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

}
