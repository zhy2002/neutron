package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;

@ComponentScope
@Subcomponent(modules = {SavingsAccountNodeModule.class})
public interface SavingsAccountNodeComponent {

    SavingsTypeNode createSavingsTypeNode();
    SavingsInstitutionNameNode createSavingsInstitutionNameNode();
    SavingsBalanceNode createSavingsBalanceNode();
    SavingsBsbNoNode createSavingsBsbNoNode();
    SavingsAccountNoNode createSavingsAccountNoNode();
    SavingsAccountNameNode createSavingsAccountNameNode();
    SavingsOwnershipListNode createOwnershipListNode();

    RuleProvider<SavingsAccountNode> getSavingsAccountNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setSavingsAccountNodeModule(SavingsAccountNodeModule module);

        SavingsAccountNodeComponent build();
    }

}
