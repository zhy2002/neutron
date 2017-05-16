package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

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

    private RuleProvider<MortgageMonthlyRepaymentNode> getRuleProvider() {
        return component.getMortgageMonthlyRepaymentNodeRuleProvider();
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

    private RuleProvider<MortgageMonthlyRepaymentNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }


    public MortgageMonthlyRepaymentNode(@NotNull ExistingMortgageNode parent, String name) {
        super(parent, name);
    }

}
