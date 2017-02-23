package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@ExpenseTypeNodeScope
@Subcomponent(modules = {ExpenseTypeNodeModule.class})
public interface ExpenseTypeNodeComponent {

    ExpenseTypeNodeRuleProvider getExpenseTypeNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setExpenseTypeNodeModule(ExpenseTypeNodeModule module);

        ExpenseTypeNodeComponent build();
    }
}
