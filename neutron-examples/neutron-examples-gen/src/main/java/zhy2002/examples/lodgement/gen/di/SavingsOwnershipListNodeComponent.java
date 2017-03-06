package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@SavingsOwnershipListNodeScope
@Subcomponent(modules = {SavingsOwnershipListNodeModule.class})
public interface SavingsOwnershipListNodeComponent {

    SavingsOwnershipListNodeRuleProvider getSavingsOwnershipListNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setSavingsOwnershipListNodeModule(SavingsOwnershipListNodeModule module);

        SavingsOwnershipListNodeComponent build();
    }
}
