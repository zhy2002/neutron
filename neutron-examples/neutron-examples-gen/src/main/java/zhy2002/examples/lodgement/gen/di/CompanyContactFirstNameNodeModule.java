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
public class CompanyContactFirstNameNodeModule {

    private final CompanyContactFirstNameNode owner;

    public CompanyContactFirstNameNodeModule(CompanyContactFirstNameNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner CompanyContactFirstNameNode provideCompanyContactFirstNameNode() {
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

    @Provides @ComponentScope CompanyContactNode provideCompanyContactNode() {
        return owner.getParent();
    }

    @Provides @Named("CompanyContactFirstNameNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<CompanyContactFirstNameNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("CompanyContactFirstNameNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<CompanyContactFirstNameNode> provideTypeRuleProvider(CompanyContactFirstNameNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<CompanyContactFirstNameNode>> provideRuleProviders(
        @Named("CompanyContactFirstNameNodeRuleProvider")  Map<String, Provider<RuleProvider<CompanyContactFirstNameNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName(), owner.getName() + "-test"};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}