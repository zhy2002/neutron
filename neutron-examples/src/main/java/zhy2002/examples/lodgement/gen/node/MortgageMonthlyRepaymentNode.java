package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class MortgageMonthlyRepaymentNode extends BaseCurrencyNode<ExistingMortgageNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return MortgageMonthlyRepaymentNode.class;
    }

    private MortgageMonthlyRepaymentNodeComponent component;

    @Inject
    void createComponent(MortgageMonthlyRepaymentNodeComponent.Builder builder) {
        this.component = builder.setMortgageMonthlyRepaymentNodeModule(new MortgageMonthlyRepaymentNodeModule(this)).build();
    }

    @Override
    protected MortgageMonthlyRepaymentNodeRuleProvider getRuleProvider() {
        return component.getMortgageMonthlyRepaymentNodeRuleProvider();
    }

    public MortgageMonthlyRepaymentNode(@NotNull ExistingMortgageNode parent, String name) {
        super(parent, name);
    }

}
