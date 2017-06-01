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
public class CompanyEmailNodeModule {

    private final CompanyEmailNode owner;

    public CompanyEmailNodeModule(CompanyEmailNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner CompanyEmailNode provideCompanyEmailNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner EmailNode<?> provideEmailNode() {
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

    @Provides @ComponentScope CompanyContactNode provideCompanyContactNode() {
        return owner.getParent();
    }

    @Provides @Named("CompanyEmailNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<CompanyEmailNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("CompanyEmailNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<CompanyEmailNode> provideTypeRuleProvider(CompanyEmailNodeRuleProvider provider) {
        return provider;
    }

        @Provides @Named("CompanyEmailNodeRuleProvider") @IntoMap @StringKey("companyEmailNode")
        RuleProvider<CompanyEmailNode> provideCompanyEmailNodeChildRuleProvider(
            CompanyContactNodeChildProvider.CompanyEmailNodeRuleProvider provider
        ) {
            return provider;
        }


    @Provides @ComponentScope
    List<RuleProvider<CompanyEmailNode>> provideRuleProviders(
        @Named("CompanyEmailNodeRuleProvider")  Map<String, Provider<RuleProvider<CompanyEmailNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}