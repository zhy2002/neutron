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
public class CompanyOtherIncomeListNodeModule {

    private final CompanyOtherIncomeListNode owner;

    public CompanyOtherIncomeListNodeModule(CompanyOtherIncomeListNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner CompanyOtherIncomeListNode provideCompanyOtherIncomeListNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner BaseOtherIncomeListNode<?> provideBaseOtherIncomeListNode() {
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

    @Provides @ComponentScope CompanyNode provideCompanyNode() {
        return owner.getParent();
    }

    @Provides @Named("CompanyOtherIncomeListNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<CompanyOtherIncomeListNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("CompanyOtherIncomeListNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<CompanyOtherIncomeListNode> provideTypeRuleProvider(CompanyOtherIncomeListNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<CompanyOtherIncomeListNode>> provideRuleProviders(
        @Named("CompanyOtherIncomeListNodeRuleProvider")  Map<String, Provider<RuleProvider<CompanyOtherIncomeListNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}