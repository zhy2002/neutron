package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@SavingsBsbNoNodeScope
@Subcomponent(modules = {SavingsBsbNoNodeModule.class})
public interface SavingsBsbNoNodeComponent {

    SavingsBsbNoNodeRuleProvider getSavingsBsbNoNodeRuleProvider();
    Map<String, RuleProvider<SavingsBsbNoNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setSavingsBsbNoNodeModule(SavingsBsbNoNodeModule module);

        SavingsBsbNoNodeComponent build();
    }
}
