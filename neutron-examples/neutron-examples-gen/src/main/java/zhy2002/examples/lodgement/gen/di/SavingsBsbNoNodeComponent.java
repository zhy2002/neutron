package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@SavingsBsbNoNodeScope
@Subcomponent(modules = {SavingsBsbNoNodeModule.class})
public interface SavingsBsbNoNodeComponent {

    SavingsBsbNoNodeRuleProvider getSavingsBsbNoNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setSavingsBsbNoNodeModule(SavingsBsbNoNodeModule module);

        SavingsBsbNoNodeComponent build();
    }
}
