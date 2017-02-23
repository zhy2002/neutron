package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

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
