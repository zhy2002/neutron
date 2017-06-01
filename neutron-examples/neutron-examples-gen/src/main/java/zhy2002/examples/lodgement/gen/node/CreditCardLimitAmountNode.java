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
    public CreditCardLimitAmountNode(@Owner CreditCardNode parent) {
        super(parent);
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

    @Override
    protected void initializeState() {
        this.component.provideRuleProviders().forEach(provider -> provider.initializeState(this));
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        this.component.provideRuleProviders().forEach(provider -> provider.createRules(createdRules));
    }

}
