package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@SavingsTypeNodeScope
@Subcomponent(modules = {SavingsTypeNodeModule.class})
public interface SavingsTypeNodeComponent {

    SavingsTypeNodeRuleProvider getSavingsTypeNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setSavingsTypeNodeModule(SavingsTypeNodeModule module);

        SavingsTypeNodeComponent build();
    }
}
