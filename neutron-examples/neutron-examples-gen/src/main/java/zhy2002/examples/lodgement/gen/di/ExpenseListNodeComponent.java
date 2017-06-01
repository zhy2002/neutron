package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {ExpenseListNodeModule.class})
public interface ExpenseListNodeComponent {

    List<RuleProvider<ExpenseListNode>> provideRuleProviders();

    ExpenseNode createExpenseNode();

    @Subcomponent.Builder
    interface Builder {

        Builder setExpenseListNodeModule(ExpenseListNodeModule module);

        ExpenseListNodeComponent build();
    }

}
