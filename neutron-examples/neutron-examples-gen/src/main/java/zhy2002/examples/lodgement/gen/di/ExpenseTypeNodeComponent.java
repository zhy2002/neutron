package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ExpenseTypeNodeScope
@Subcomponent(modules = {ExpenseTypeNodeModule.class})
public interface ExpenseTypeNodeComponent {

    ExpenseTypeNodeRuleProvider getExpenseTypeNodeRuleProvider();
    Map<String, RuleProvider<ExpenseTypeNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setExpenseTypeNodeModule(ExpenseTypeNodeModule module);

        ExpenseTypeNodeComponent build();
    }
}
