package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {SavingsBsbNoNodeModule.class})
public interface SavingsBsbNoNodeComponent {

    RuleProvider<SavingsBsbNoNode> getSavingsBsbNoNodeRuleProvider();
    Map<String, RuleProvider<SavingsBsbNoNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setSavingsBsbNoNodeModule(SavingsBsbNoNodeModule module);

        SavingsBsbNoNodeComponent build();
    }
}
