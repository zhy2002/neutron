package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {ExpenseMonthlyRepaymentNodeModule.class})
public interface ExpenseMonthlyRepaymentNodeComponent {

    RuleProvider<ExpenseMonthlyRepaymentNode> getExpenseMonthlyRepaymentNodeRuleProvider();
    Map<String, RuleProvider<ExpenseMonthlyRepaymentNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setExpenseMonthlyRepaymentNodeModule(ExpenseMonthlyRepaymentNodeModule module);

        ExpenseMonthlyRepaymentNodeComponent build();
    }
}
