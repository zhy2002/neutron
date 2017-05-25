package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;

@ExpenseNodeScope
@Subcomponent(modules = {ExpenseNodeModule.class})
public interface ExpenseNodeComponent {

    RuleProvider<ExpenseNode> getExpenseNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setExpenseNodeModule(ExpenseNodeModule module);

        ExpenseNodeComponent build();
    }
}
