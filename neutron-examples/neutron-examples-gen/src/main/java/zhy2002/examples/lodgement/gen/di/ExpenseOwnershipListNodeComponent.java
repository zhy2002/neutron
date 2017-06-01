package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {ExpenseOwnershipListNodeModule.class})
public interface ExpenseOwnershipListNodeComponent extends OwnershipListNodeComponent {


    RuleProvider<ExpenseOwnershipListNode> getExpenseOwnershipListNodeRuleProvider();
    Map<String, RuleProvider<ExpenseOwnershipListNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setExpenseOwnershipListNodeModule(ExpenseOwnershipListNodeModule module);

        ExpenseOwnershipListNodeComponent build();
    }

}
