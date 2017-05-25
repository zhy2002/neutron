package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class SavingsInstitutionNameNodeModule {

    private final SavingsInstitutionNameNode owner;

    public SavingsInstitutionNameNodeModule(SavingsInstitutionNameNode owner) {
        this.owner = owner;
    }

    @Provides @SavingsInstitutionNameNodeScope @Owner SavingsInstitutionNameNode provideSavingsInstitutionNameNode() {
        return owner;
    }

    @Provides @SavingsInstitutionNameNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @SavingsInstitutionNameNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @SavingsInstitutionNameNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @SavingsInstitutionNameNodeScope SavingsAccountNode provideSavingsAccountNode() {
        return owner.getParent();
    }

    @Provides @SavingsInstitutionNameNodeScope
    RuleProvider<SavingsInstitutionNameNode> provideRuleProvider(Provider<SavingsInstitutionNameNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @SavingsInstitutionNameNodeScope
    Map<String, RuleProvider<SavingsInstitutionNameNode>> provideInstanceProviderMap(
        Provider<SavingsAccountNodeChildProvider.SavingsInstitutionNameNodeRuleProvider> savingsInstitutionNameNodeRuleProvider
    ) {
        Map<String, RuleProvider<SavingsInstitutionNameNode>> result = new HashMap<>();
        result.put("savingsInstitutionNameNode", savingsInstitutionNameNodeRuleProvider.get());
        return result;
    }
}