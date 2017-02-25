package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;

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

    @Override
    protected CreditCardAmountOwingNodeRuleProvider getRuleProvider() {
        return component.getCreditCardAmountOwingNodeRuleProvider();
    }

    public CreditCardAmountOwingNode(@NotNull CreditCardNode parent, String name) {
        super(parent, name);
    }

}
