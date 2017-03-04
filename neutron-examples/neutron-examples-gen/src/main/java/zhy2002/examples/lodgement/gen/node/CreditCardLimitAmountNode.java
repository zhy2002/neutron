package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class CreditCardLimitAmountNode extends BaseCurrencyNode<CreditCardNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return CreditCardLimitAmountNode.class;
    }

    private CreditCardLimitAmountNodeComponent component;

    @Inject
    void createComponent(CreditCardLimitAmountNodeComponent.Builder builder) {
        this.component = builder.setCreditCardLimitAmountNodeModule(new CreditCardLimitAmountNodeModule(this)).build();
    }

    @Override
    protected CreditCardLimitAmountNodeRuleProvider getRuleProvider() {
        return component.getCreditCardLimitAmountNodeRuleProvider();
    }

    @Override
    protected void initializeRuleState() {
        getRuleProvider().initializeState(this);
    }


    public CreditCardLimitAmountNode(@NotNull CreditCardNode parent, String name) {
        super(parent, name);
    }

}
