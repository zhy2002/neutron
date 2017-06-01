package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {SavingsAccountNodeModule.class})
public interface SavingsAccountNodeComponent {

    List<RuleProvider<SavingsAccountNode>> provideRuleProviders();

    SavingsTypeNode createSavingsTypeNode();
    SavingsInstitutionNameNode createSavingsInstitutionNameNode();
    SavingsBalanceNode createSavingsBalanceNode();
    SavingsBsbNoNode createSavingsBsbNoNode();
    SavingsAccountNoNode createSavingsAccountNoNode();
    SavingsAccountNameNode createSavingsAccountNameNode();
    SavingsOwnershipListNode createSavingsOwnershipListNode();

    @Subcomponent.Builder
    interface Builder {

        Builder setSavingsAccountNodeModule(SavingsAccountNodeModule module);

        SavingsAccountNodeComponent build();
    }

}
