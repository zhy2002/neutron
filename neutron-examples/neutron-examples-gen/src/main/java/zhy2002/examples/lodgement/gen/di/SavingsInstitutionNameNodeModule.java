package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import dagger.multibindings.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import zhy2002.neutron.config.NeutronConstants;
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

    @Provides @Named("SavingsInstitutionNameNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<SavingsInstitutionNameNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("SavingsInstitutionNameNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<SavingsInstitutionNameNode> provideTypeRuleProvider(SavingsInstitutionNameNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<SavingsInstitutionNameNode>> provideRuleProviders(
        @Named("SavingsInstitutionNameNodeRuleProvider")  Map<String, Provider<RuleProvider<SavingsInstitutionNameNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}