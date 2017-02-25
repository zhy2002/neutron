package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;

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

    @Override
    protected CreditCardBreakCostNodeRuleProvider getRuleProvider() {
        return component.getCreditCardBreakCostNodeRuleProvider();
    }

    public CreditCardBreakCostNode(@NotNull CreditCardNode parent, String name) {
        super(parent, name);
    }

}
