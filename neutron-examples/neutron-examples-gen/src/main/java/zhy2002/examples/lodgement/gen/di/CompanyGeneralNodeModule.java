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
public class CompanyGeneralNodeModule {

    private final CompanyGeneralNode owner;

    public CompanyGeneralNodeModule(CompanyGeneralNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner CompanyGeneralNode provideCompanyGeneralNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ObjectUiNode<?> provideObjectUiNode() {
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

    @Provides @Named("CompanyGeneralNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<CompanyGeneralNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("CompanyGeneralNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<CompanyGeneralNode> provideTypeRuleProvider(CompanyGeneralNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<CompanyGeneralNode>> provideRuleProviders(
        @Named("CompanyGeneralNodeRuleProvider")  Map<String, Provider<RuleProvider<CompanyGeneralNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}