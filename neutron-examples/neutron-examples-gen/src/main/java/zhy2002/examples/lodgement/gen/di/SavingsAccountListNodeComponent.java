package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@SavingsAccountListNodeScope
@Subcomponent(modules = {SavingsAccountListNodeModule.class})
public interface SavingsAccountListNodeComponent {

    SavingsAccountListNodeRuleProvider getSavingsAccountListNodeRuleProvider();
    Map<String, RuleProvider<SavingsAccountListNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setSavingsAccountListNodeModule(SavingsAccountListNodeModule module);

        SavingsAccountListNodeComponent build();
    }
}
