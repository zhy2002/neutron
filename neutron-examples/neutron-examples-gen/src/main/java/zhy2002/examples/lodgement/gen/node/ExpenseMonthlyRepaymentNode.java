package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class ExpenseMonthlyRepaymentNode extends BigDecimalUiNode<ExpenseNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return ExpenseMonthlyRepaymentNode.class;
    }

    private ExpenseMonthlyRepaymentNodeComponent component;

    @Inject
    void createComponent(ExpenseMonthlyRepaymentNodeComponent.Builder builder) {
        this.component = builder.setExpenseMonthlyRepaymentNodeModule(new ExpenseMonthlyRepaymentNodeModule(this)).build();
    }

    private ExpenseMonthlyRepaymentNodeRuleProvider getRuleProvider() {
        return component.getExpenseMonthlyRepaymentNodeRuleProvider();
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

    private RuleProvider<ExpenseMonthlyRepaymentNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

    public ExpenseMonthlyRepaymentNode(@NotNull ExpenseNode parent, String name) {
        super(parent, name);
    }

}
