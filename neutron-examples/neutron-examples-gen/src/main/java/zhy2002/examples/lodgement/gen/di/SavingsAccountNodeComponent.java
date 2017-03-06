package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@SavingsAccountNodeScope
@Subcomponent(modules = {SavingsAccountNodeModule.class})
public interface SavingsAccountNodeComponent {

    SavingsAccountNodeRuleProvider getSavingsAccountNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setSavingsAccountNodeModule(SavingsAccountNodeModule module);

        SavingsAccountNodeComponent build();
    }
}
