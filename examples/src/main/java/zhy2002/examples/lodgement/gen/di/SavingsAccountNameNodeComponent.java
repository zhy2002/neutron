package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@SavingsAccountNameNodeScope
@Subcomponent(modules = {SavingsAccountNameNodeModule.class})
public interface SavingsAccountNameNodeComponent {

    SavingsAccountNameNodeRuleProvider getSavingsAccountNameNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setSavingsAccountNameNodeModule(SavingsAccountNameNodeModule module);

        SavingsAccountNameNodeComponent build();
    }
}
