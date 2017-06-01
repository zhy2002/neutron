package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {ExpenseTypeNodeModule.class})
public interface ExpenseTypeNodeComponent {

    List<RuleProvider<ExpenseTypeNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setExpenseTypeNodeModule(ExpenseTypeNodeModule module);

        ExpenseTypeNodeComponent build();
    }

}
