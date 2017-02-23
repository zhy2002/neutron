package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@SavingsAccountNoNodeScope
@Subcomponent(modules = {SavingsAccountNoNodeModule.class})
public interface SavingsAccountNoNodeComponent {

    SavingsAccountNoNodeRuleProvider getSavingsAccountNoNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setSavingsAccountNoNodeModule(SavingsAccountNoNodeModule module);

        SavingsAccountNoNodeComponent build();
    }
}
