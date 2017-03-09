package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ExpenseListNodeScope
@Subcomponent(modules = {ExpenseListNodeModule.class})
public interface ExpenseListNodeComponent {

    ExpenseListNodeRuleProvider getExpenseListNodeRuleProvider();
    Map<String, RuleProvider<ExpenseListNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setExpenseListNodeModule(ExpenseListNodeModule module);

        ExpenseListNodeComponent build();
    }
}
