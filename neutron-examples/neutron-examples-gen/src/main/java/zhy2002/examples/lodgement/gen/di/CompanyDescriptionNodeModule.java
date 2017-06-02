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
public class CompanyDescriptionNodeModule {

    private final CompanyDescriptionNode owner;

    public CompanyDescriptionNodeModule(CompanyDescriptionNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner CompanyDescriptionNode provideCompanyDescriptionNode() {
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

    @Provides @Named("CompanyDescriptionNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<CompanyDescriptionNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("CompanyDescriptionNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<CompanyDescriptionNode> provideTypeRuleProvider(CompanyDescriptionNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<CompanyDescriptionNode>> provideRuleProviders(
        @Named("CompanyDescriptionNodeRuleProvider")  Map<String, Provider<RuleProvider<CompanyDescriptionNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}