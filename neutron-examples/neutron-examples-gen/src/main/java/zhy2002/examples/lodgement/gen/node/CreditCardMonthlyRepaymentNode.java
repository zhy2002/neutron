package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class CreditCardMonthlyRepaymentNode extends BaseCurrencyNode<CreditCardNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return CreditCardMonthlyRepaymentNode.class;
    }

    private CreditCardMonthlyRepaymentNodeComponent component;

    @Inject
    void createComponent(CreditCardMonthlyRepaymentNodeComponent.Builder builder) {
        this.component = builder.setCreditCardMonthlyRepaymentNodeModule(new CreditCardMonthlyRepaymentNodeModule(this)).build();
    }

    @Override
    protected CreditCardMonthlyRepaymentNodeRuleProvider getRuleProvider() {
        return component.getCreditCardMonthlyRepaymentNodeRuleProvider();
    }

    @Override
    protected void initializeRuleState() {
        getRuleProvider().initializeState(this);
    }


    public CreditCardMonthlyRepaymentNode(@NotNull CreditCardNode parent, String name) {
        super(parent, name);
    }

}
