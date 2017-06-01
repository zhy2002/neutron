package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {ExpenseListNodeModule.class})
public interface ExpenseListNodeComponent {

    ExpenseNode createExpenseNode();

    RuleProvider<ExpenseListNode> getExpenseListNodeRuleProvider();
    Map<String, RuleProvider<ExpenseListNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setExpenseListNodeModule(ExpenseListNodeModule module);

        ExpenseListNodeComponent build();
    }

}
