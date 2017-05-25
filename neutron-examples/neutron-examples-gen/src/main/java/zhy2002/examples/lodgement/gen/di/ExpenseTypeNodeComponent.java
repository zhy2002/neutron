package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ExpenseTypeNodeScope
@Subcomponent(modules = {ExpenseTypeNodeModule.class})
public interface ExpenseTypeNodeComponent {

    RuleProvider<ExpenseTypeNode> getExpenseTypeNodeRuleProvider();
    Map<String, RuleProvider<ExpenseTypeNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setExpenseTypeNodeModule(ExpenseTypeNodeModule module);

        ExpenseTypeNodeComponent build();
    }
}
