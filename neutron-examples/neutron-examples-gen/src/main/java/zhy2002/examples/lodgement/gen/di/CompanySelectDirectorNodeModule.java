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
public class CompanySelectDirectorNodeModule {

    private final CompanySelectDirectorNode owner;

    public CompanySelectDirectorNodeModule(CompanySelectDirectorNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner CompanySelectDirectorNode provideCompanySelectDirectorNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner SelectRelatedPersonListNode<?> provideSelectRelatedPersonListNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ListUiNode<?,?> provideListUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ComponentScope CompanyGeneralNode provideCompanyGeneralNode() {
        return owner.getParent();
    }

    @Provides @Named("CompanySelectDirectorNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<CompanySelectDirectorNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("CompanySelectDirectorNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<CompanySelectDirectorNode> provideTypeRuleProvider(CompanySelectDirectorNodeRuleProvider provider) {
        return provider;
    }

        @Provides @Named("CompanySelectDirectorNodeRuleProvider") @IntoMap @StringKey("companySelectDirectorNode")
        RuleProvider<CompanySelectDirectorNode> provideCompanySelectDirectorNodeChildRuleProvider(
            CompanyGeneralNodeChildProvider.CompanySelectDirectorNodeRuleProvider provider
        ) {
            return provider;
        }


    @Provides @ComponentScope
    List<RuleProvider<CompanySelectDirectorNode>> provideRuleProviders(
        @Named("CompanySelectDirectorNodeRuleProvider")  Map<String, Provider<RuleProvider<CompanySelectDirectorNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}