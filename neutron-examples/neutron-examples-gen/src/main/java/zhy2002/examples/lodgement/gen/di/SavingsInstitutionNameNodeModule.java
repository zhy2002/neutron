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

    @Provides @ComponentScope @Owner SavingsInstitutionNameNode provideSavingsInstitutionNameNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ComponentScope SavingsAccountNode provideSavingsAccountNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<SavingsInstitutionNameNode> provideRuleProvider(Provider<SavingsInstitutionNameNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<SavingsInstitutionNameNode>> provideInstanceProviderMap(
        Provider<SavingsAccountNodeChildProvider.SavingsInstitutionNameNodeRuleProvider> savingsInstitutionNameNodeRuleProvider
    ) {
        Map<String, RuleProvider<SavingsInstitutionNameNode>> result = new HashMap<>();
        result.put("savingsInstitutionNameNode", savingsInstitutionNameNodeRuleProvider.get());
        return result;
    }
}