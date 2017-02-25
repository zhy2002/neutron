package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.data.*;
import zhy2002.neutron.util.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.math.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;

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

    @Override
    protected ExpenseMonthlyRepaymentNodeRuleProvider getRuleProvider() {
        return component.getExpenseMonthlyRepaymentNodeRuleProvider();
    }

    public ExpenseMonthlyRepaymentNode(ExpenseNode parent, String name) {
        super(parent, name);
    }

}
