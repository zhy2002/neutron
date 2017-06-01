package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.CreditCardLimitAmountNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class CreditCardLimitAmountNode extends BaseCurrencyNode<CreditCardNode> {

    @Inject
    public CreditCardLimitAmountNode(@Owner CreditCardNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return CreditCardLimitAmountNode.class;
    }

    protected final CreditCardLimitAmountNodeComponent getComponent() {
        return component;
    }


    private CreditCardLimitAmountNodeComponent component;

    @Inject
    void createComponent(CreditCardLimitAmountNodeComponent.Builder builder) {
        this.component = builder.setCreditCardLimitAmountNodeModule(new CreditCardLimitAmountNodeModule(this)).build();
    }

    private RuleProvider<CreditCardLimitAmountNode> getRuleProvider() {
        return component.getCreditCardLimitAmountNodeRuleProvider();
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

    private RuleProvider<CreditCardLimitAmountNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
