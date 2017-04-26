package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class LoanMonthlyRepaymentNode extends BaseCurrencyNode<LoanNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return LoanMonthlyRepaymentNode.class;
    }

    private LoanMonthlyRepaymentNodeComponent component;

    @Inject
    void createComponent(LoanMonthlyRepaymentNodeComponent.Builder builder) {
        this.component = builder.setLoanMonthlyRepaymentNodeModule(new LoanMonthlyRepaymentNodeModule(this)).build();
    }

    private RuleProvider<LoanMonthlyRepaymentNode> getRuleProvider() {
        return component.getLoanMonthlyRepaymentNodeRuleProvider();
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

    private RuleProvider<LoanMonthlyRepaymentNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }


    public LoanMonthlyRepaymentNode(@NotNull LoanNode parent, String name) {
        super(parent, name);
    }

}
