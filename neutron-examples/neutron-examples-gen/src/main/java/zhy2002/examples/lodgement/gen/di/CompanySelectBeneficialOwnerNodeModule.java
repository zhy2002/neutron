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
public class CompanySelectBeneficialOwnerNodeModule {

    private final CompanySelectBeneficialOwnerNode owner;

    public CompanySelectBeneficialOwnerNodeModule(CompanySelectBeneficialOwnerNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner CompanySelectBeneficialOwnerNode provideCompanySelectBeneficialOwnerNode() {
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

    @Provides @Named("CompanySelectBeneficialOwnerNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<CompanySelectBeneficialOwnerNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("CompanySelectBeneficialOwnerNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<CompanySelectBeneficialOwnerNode> provideTypeRuleProvider(CompanySelectBeneficialOwnerNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<CompanySelectBeneficialOwnerNode>> provideRuleProviders(
        @Named("CompanySelectBeneficialOwnerNodeRuleProvider")  Map<String, Provider<RuleProvider<CompanySelectBeneficialOwnerNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}