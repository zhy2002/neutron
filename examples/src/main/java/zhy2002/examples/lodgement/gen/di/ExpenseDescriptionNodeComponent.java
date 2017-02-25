package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@ExpenseDescriptionNodeScope
@Subcomponent(modules = {ExpenseDescriptionNodeModule.class})
public interface ExpenseDescriptionNodeComponent {

    ExpenseDescriptionNodeRuleProvider getExpenseDescriptionNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setExpenseDescriptionNodeModule(ExpenseDescriptionNodeModule module);

        ExpenseDescriptionNodeComponent build();
    }
}
