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
public class PropertyAddressNodeModule {

    private final PropertyAddressNode owner;

    public PropertyAddressNodeModule(PropertyAddressNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner PropertyAddressNode providePropertyAddressNode() {
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

    @Provides @ComponentScope PropertyDetailsNode providePropertyDetailsNode() {
        return owner.getParent();
    }

    @Provides @Named("PropertyAddressNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<PropertyAddressNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("PropertyAddressNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<PropertyAddressNode> provideTypeRuleProvider(PropertyAddressNodeRuleProvider provider) {
        return provider;
    }

        @Provides @Named("PropertyAddressNodeRuleProvider") @IntoMap @StringKey("propertyAddressNode")
        RuleProvider<PropertyAddressNode> providePropertyAddressNodeChildRuleProvider(
            PropertyDetailsNodeChildProvider.PropertyAddressNodeRuleProvider provider
        ) {
            return provider;
        }


    @Provides @ComponentScope
    List<RuleProvider<PropertyAddressNode>> provideRuleProviders(
        @Named("PropertyAddressNodeRuleProvider")  Map<String, Provider<RuleProvider<PropertyAddressNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}