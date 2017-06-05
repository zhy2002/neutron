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
public class CompanyApplicantTypeNodeModule {

    private final CompanyApplicantTypeNode owner;

    public CompanyApplicantTypeNodeModule(CompanyApplicantTypeNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner CompanyApplicantTypeNode provideCompanyApplicantTypeNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner BaseApplicantTypeNode<?> provideBaseApplicantTypeNode() {
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

    @Provides @Named("CompanyApplicantTypeNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<CompanyApplicantTypeNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("CompanyApplicantTypeNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<CompanyApplicantTypeNode> provideTypeRuleProvider(CompanyApplicantTypeNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<CompanyApplicantTypeNode>> provideRuleProviders(
        @Named("CompanyApplicantTypeNodeRuleProvider")  Map<String, Provider<RuleProvider<CompanyApplicantTypeNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}