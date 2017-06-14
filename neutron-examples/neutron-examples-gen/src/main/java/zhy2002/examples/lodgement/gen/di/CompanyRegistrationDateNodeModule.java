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
public class CompanyRegistrationDateNodeModule {

    private final CompanyRegistrationDateNode owner;

    public CompanyRegistrationDateNodeModule(CompanyRegistrationDateNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner CompanyRegistrationDateNode provideCompanyRegistrationDateNode() {
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

    @Provides @Named("CompanyRegistrationDateNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<CompanyRegistrationDateNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("CompanyRegistrationDateNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<CompanyRegistrationDateNode> provideTypeRuleProvider(CompanyRegistrationDateNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<CompanyRegistrationDateNode>> provideRuleProviders(
        @Named("CompanyRegistrationDateNodeRuleProvider")  Map<String, Provider<RuleProvider<CompanyRegistrationDateNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName(), owner.getName() + "-test"};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}