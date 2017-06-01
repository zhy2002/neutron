package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {ExpenseDescriptionNodeModule.class})
public interface ExpenseDescriptionNodeComponent {


    RuleProvider<ExpenseDescriptionNode> getExpenseDescriptionNodeRuleProvider();
    Map<String, RuleProvider<ExpenseDescriptionNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setExpenseDescriptionNodeModule(ExpenseDescriptionNodeModule module);

        ExpenseDescriptionNodeComponent build();
    }

}
