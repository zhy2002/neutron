package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@ExpenseNodeScope
@Subcomponent(modules = {ExpenseNodeModule.class})
public interface ExpenseNodeComponent {

    ExpenseNodeRuleProvider getExpenseNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setExpenseNodeModule(ExpenseNodeModule module);

        ExpenseNodeComponent build();
    }
}
