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
public class CompanyListNodeModule {

    private final CompanyListNode owner;

    public CompanyListNodeModule(CompanyListNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner CompanyListNode provideCompanyListNode() {
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

    @Provides @ComponentScope ApplicationNode provideApplicationNode() {
        return owner.getParent();
    }

    @Provides @Named("CompanyListNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<CompanyListNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("CompanyListNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<CompanyListNode> provideTypeRuleProvider(CompanyListNodeRuleProvider provider) {
        return provider;
    }

        @Provides @Named("CompanyListNodeRuleProvider") @IntoMap @StringKey("companyListNode")
        RuleProvider<CompanyListNode> provideCompanyListNodeChildRuleProvider(
            ApplicationNodeChildProvider.CompanyListNodeRuleProvider provider
        ) {
            return provider;
        }


    @Provides @ComponentScope
    List<RuleProvider<CompanyListNode>> provideRuleProviders(
        @Named("CompanyListNodeRuleProvider")  Map<String, Provider<RuleProvider<CompanyListNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}