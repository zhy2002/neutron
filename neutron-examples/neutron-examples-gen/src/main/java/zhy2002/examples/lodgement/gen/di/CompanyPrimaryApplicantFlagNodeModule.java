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
public class CompanyPrimaryApplicantFlagNodeModule {

    private final CompanyPrimaryApplicantFlagNode owner;

    public CompanyPrimaryApplicantFlagNodeModule(CompanyPrimaryApplicantFlagNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner CompanyPrimaryApplicantFlagNode provideCompanyPrimaryApplicantFlagNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner BooleanUiNode<?> provideBooleanUiNode() {
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

    @Provides @Named("CompanyPrimaryApplicantFlagNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<CompanyPrimaryApplicantFlagNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("CompanyPrimaryApplicantFlagNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<CompanyPrimaryApplicantFlagNode> provideTypeRuleProvider(CompanyPrimaryApplicantFlagNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<CompanyPrimaryApplicantFlagNode>> provideRuleProviders(
        @Named("CompanyPrimaryApplicantFlagNodeRuleProvider")  Map<String, Provider<RuleProvider<CompanyPrimaryApplicantFlagNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}