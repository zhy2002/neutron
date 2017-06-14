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
public class CountryNodeModule {

    private final CountryNode owner;

    public CountryNodeModule(CountryNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner CountryNode provideCountryNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner BaseCountryNode<?> provideBaseCountryNode() {
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

    @Provides @ComponentScope AddressNode<?> provideAddressNode() {
        return owner.getParent();
    }

    @Provides @Named("CountryNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<CountryNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("CountryNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<CountryNode> provideTypeRuleProvider(CountryNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<CountryNode>> provideRuleProviders(
        @Named("CountryNodeRuleProvider")  Map<String, Provider<RuleProvider<CountryNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName(), owner.getName() + "-test"};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}