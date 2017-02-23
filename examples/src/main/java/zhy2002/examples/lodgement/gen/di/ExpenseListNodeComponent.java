package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@ExpenseListNodeScope
@Subcomponent(modules = {ExpenseListNodeModule.class})
public interface ExpenseListNodeComponent {

    ExpenseListNodeRuleProvider getExpenseListNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setExpenseListNodeModule(ExpenseListNodeModule module);

        ExpenseListNodeComponent build();
    }
}
