package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.CreditCardMonthlyRepaymentNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class CreditCardMonthlyRepaymentNode extends BaseCurrencyNode<CreditCardNode> {

    @Inject
    public CreditCardMonthlyRepaymentNode(@Owner CreditCardNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return CreditCardMonthlyRepaymentNode.class;
    }

    protected final CreditCardMonthlyRepaymentNodeComponent getComponent() {
        return component;
    }


    private CreditCardMonthlyRepaymentNodeComponent component;

    @Inject
    void createComponent(CreditCardMonthlyRepaymentNodeComponent.Builder builder) {
        this.component = builder.setCreditCardMonthlyRepaymentNodeModule(new CreditCardMonthlyRepaymentNodeModule(this)).build();
    }

    @Override
    protected void initializeState() {
        this.component.provideRuleProviders().forEach(provider -> provider.initializeState(this));
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        this.component.provideRuleProviders().forEach(provider -> provider.createRules(createdRules));
    }

}
