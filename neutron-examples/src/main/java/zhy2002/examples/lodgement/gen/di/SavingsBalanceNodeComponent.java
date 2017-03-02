package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@SavingsBalanceNodeScope
@Subcomponent(modules = {SavingsBalanceNodeModule.class})
public interface SavingsBalanceNodeComponent {

    SavingsBalanceNodeRuleProvider getSavingsBalanceNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setSavingsBalanceNodeModule(SavingsBalanceNodeModule module);

        SavingsBalanceNodeComponent build();
    }
}
