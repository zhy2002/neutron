package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@SavingsAccountListNodeScope
@Subcomponent(modules = {SavingsAccountListNodeModule.class})
public interface SavingsAccountListNodeComponent {

    SavingsAccountListNodeRuleProvider getSavingsAccountListNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setSavingsAccountListNodeModule(SavingsAccountListNodeModule module);

        SavingsAccountListNodeComponent build();
    }
}
