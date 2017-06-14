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
public class CompanyPrivacyNodeModule {

    private final CompanyPrivacyNode owner;

    public CompanyPrivacyNodeModule(CompanyPrivacyNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner CompanyPrivacyNode provideCompanyPrivacyNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner BasePrivacyNode<?> provideBasePrivacyNode() {
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

    @Provides @Named("CompanyPrivacyNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<CompanyPrivacyNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("CompanyPrivacyNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<CompanyPrivacyNode> provideTypeRuleProvider(CompanyPrivacyNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<CompanyPrivacyNode>> provideRuleProviders(
        @Named("CompanyPrivacyNodeRuleProvider")  Map<String, Provider<RuleProvider<CompanyPrivacyNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName(), owner.getName() + "-test"};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}