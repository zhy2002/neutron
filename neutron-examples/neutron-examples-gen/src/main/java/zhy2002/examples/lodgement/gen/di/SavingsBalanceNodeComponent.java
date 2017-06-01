package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {SavingsBalanceNodeModule.class})
public interface SavingsBalanceNodeComponent {


    RuleProvider<SavingsBalanceNode> getSavingsBalanceNodeRuleProvider();
    Map<String, RuleProvider<SavingsBalanceNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setSavingsBalanceNodeModule(SavingsBalanceNodeModule module);

        SavingsBalanceNodeComponent build();
    }

}
