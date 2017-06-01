package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {ExpenseNodeModule.class})
public interface ExpenseNodeComponent {

    List<RuleProvider<ExpenseNode>> provideRuleProviders();

    ExpenseTypeNode createExpenseTypeNode();
    ExpenseDescriptionNode createExpenseDescriptionNode();
    ExpenseMonthlyRepaymentNode createExpenseMonthlyRepaymentNode();
    ExpenseOwnershipListNode createExpenseOwnershipListNode();

    @Subcomponent.Builder
    interface Builder {

        Builder setExpenseNodeModule(ExpenseNodeModule module);

        ExpenseNodeComponent build();
    }

}
