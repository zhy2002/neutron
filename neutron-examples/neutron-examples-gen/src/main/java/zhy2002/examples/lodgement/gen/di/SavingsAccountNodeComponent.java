package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;

@SavingsAccountNodeScope
@Subcomponent(modules = {SavingsAccountNodeModule.class})
public interface SavingsAccountNodeComponent {

    RuleProvider<SavingsAccountNode> getSavingsAccountNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setSavingsAccountNodeModule(SavingsAccountNodeModule module);

        SavingsAccountNodeComponent build();
    }
}
