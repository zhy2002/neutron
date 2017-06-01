package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {SavingsAccountListNodeModule.class})
public interface SavingsAccountListNodeComponent {

    List<RuleProvider<SavingsAccountListNode>> provideRuleProviders();

    SavingsAccountNode createSavingsAccountNode();

    @Subcomponent.Builder
    interface Builder {

        Builder setSavingsAccountListNodeModule(SavingsAccountListNodeModule module);

        SavingsAccountListNodeComponent build();
    }

}
