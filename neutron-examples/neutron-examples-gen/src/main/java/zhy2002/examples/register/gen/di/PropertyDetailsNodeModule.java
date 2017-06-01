package zhy2002.examples.register.gen.di;
import dagger.*;
import dagger.multibindings.*;
import javax.inject.*;
import zhy2002.examples.register.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;
import zhy2002.neutron.util.NeutronConstants;


@Module
public class PropertyDetailsNodeModule {

    private final PropertyDetailsNode owner;

    public PropertyDetailsNodeModule(PropertyDetailsNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner PropertyDetailsNode providePropertyDetailsNode() {
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

    @Provides @ComponentScope RegisterNode provideRegisterNode() {
        return owner.getParent();
    }

    @Provides @Named("PropertyDetailsNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<PropertyDetailsNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("PropertyDetailsNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<PropertyDetailsNode> provideTypeRuleProvider(PropertyDetailsNodeRuleProvider provider) {
        return provider;
    }

        @Provides @Named("PropertyDetailsNodeRuleProvider") @IntoMap @StringKey("residentialPropertyNode")
        RuleProvider<PropertyDetailsNode> provideResidentialPropertyNodeChildRuleProvider(
            RegisterNodeChildProvider.ResidentialPropertyNodeRuleProvider provider
        ) {
            return provider;
        }

        @Provides @Named("PropertyDetailsNodeRuleProvider") @IntoMap @StringKey("investmentPropertyNode")
        RuleProvider<PropertyDetailsNode> provideInvestmentPropertyNodeChildRuleProvider(
            RegisterNodeChildProvider.InvestmentPropertyNodeRuleProvider provider
        ) {
            return provider;
        }


    @Provides @ComponentScope
    List<RuleProvider<PropertyDetailsNode>> provideRuleProviders(
        @Named("PropertyDetailsNodeRuleProvider")  Map<String, Provider<RuleProvider<PropertyDetailsNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}