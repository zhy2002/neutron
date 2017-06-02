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
public class CompanyIndustryNodeModule {

    private final CompanyIndustryNode owner;

    public CompanyIndustryNodeModule(CompanyIndustryNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner CompanyIndustryNode provideCompanyIndustryNode() {
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

    @Provides @ComponentScope CompanyGeneralNode provideCompanyGeneralNode() {
        return owner.getParent();
    }

    @Provides @Named("CompanyIndustryNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<CompanyIndustryNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("CompanyIndustryNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<CompanyIndustryNode> provideTypeRuleProvider(CompanyIndustryNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<CompanyIndustryNode>> provideRuleProviders(
        @Named("CompanyIndustryNodeRuleProvider")  Map<String, Provider<RuleProvider<CompanyIndustryNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}