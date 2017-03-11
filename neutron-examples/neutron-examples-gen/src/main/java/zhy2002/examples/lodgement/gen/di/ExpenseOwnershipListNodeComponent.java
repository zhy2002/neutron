package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ExpenseOwnershipListNodeScope
@Subcomponent(modules = {ExpenseOwnershipListNodeModule.class})
public interface ExpenseOwnershipListNodeComponent {

    ExpenseOwnershipListNodeRuleProvider getExpenseOwnershipListNodeRuleProvider();
    Map<String, RuleProvider<ExpenseOwnershipListNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setExpenseOwnershipListNodeModule(ExpenseOwnershipListNodeModule module);

        ExpenseOwnershipListNodeComponent build();
    }
}
