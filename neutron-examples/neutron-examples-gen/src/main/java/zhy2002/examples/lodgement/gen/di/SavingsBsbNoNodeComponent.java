package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {SavingsBsbNoNodeModule.class})
public interface SavingsBsbNoNodeComponent {

    List<RuleProvider<SavingsBsbNoNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setSavingsBsbNoNodeModule(SavingsBsbNoNodeModule module);

        SavingsBsbNoNodeComponent build();
    }

}
