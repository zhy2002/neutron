package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


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

    @Override
    protected LoanMonthlyRepaymentNodeRuleProvider getRuleProvider() {
        return component.getLoanMonthlyRepaymentNodeRuleProvider();
    }

    @Override
    protected void initializeRuleState() {
        getRuleProvider().initializeState(this);
    }


    public LoanMonthlyRepaymentNode(@NotNull LoanNode parent, String name) {
        super(parent, name);
    }

}
