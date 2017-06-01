package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import dagger.multibindings.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;
import zhy2002.neutron.util.NeutronConstants;


@Module
public class CompanyTrustNodeModule {

    private final CompanyTrustNode owner;

    public CompanyTrustNodeModule(CompanyTrustNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner CompanyTrustNode provideCompanyTrustNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner BaseTrustNode<?> provideBaseTrustNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ComponentScope CompanyNode provideCompanyNode() {
        return owner.getParent();
    }

    @Provides @Named("CompanyTrustNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<CompanyTrustNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("CompanyTrustNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<CompanyTrustNode> provideTypeRuleProvider(CompanyTrustNodeRuleProvider provider) {
        return provider;
    }

        @Provides @Named("CompanyTrustNodeRuleProvider") @IntoMap @StringKey("companyTrustNode")
        RuleProvider<CompanyTrustNode> provideCompanyTrustNodeChildRuleProvider(
            CompanyNodeChildProvider.CompanyTrustNodeRuleProvider provider
        ) {
            return provider;
        }


    @Provides @ComponentScope
    List<RuleProvider<CompanyTrustNode>> provideRuleProviders(
        @Named("CompanyTrustNodeRuleProvider")  Map<String, Provider<RuleProvider<CompanyTrustNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}