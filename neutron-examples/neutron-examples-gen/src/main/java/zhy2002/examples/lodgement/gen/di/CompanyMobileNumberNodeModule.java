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
public class CompanyMobileNumberNodeModule {

    private final CompanyMobileNumberNode owner;

    public CompanyMobileNumberNodeModule(CompanyMobileNumberNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner CompanyMobileNumberNode provideCompanyMobileNumberNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner BaseMobileNumberNode<?> provideBaseMobileNumberNode() {
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

    @Provides @Named("CompanyMobileNumberNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<CompanyMobileNumberNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("CompanyMobileNumberNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<CompanyMobileNumberNode> provideTypeRuleProvider(CompanyMobileNumberNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<CompanyMobileNumberNode>> provideRuleProviders(
        @Named("CompanyMobileNumberNodeRuleProvider")  Map<String, Provider<RuleProvider<CompanyMobileNumberNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName(), owner.getName() + "-test"};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}