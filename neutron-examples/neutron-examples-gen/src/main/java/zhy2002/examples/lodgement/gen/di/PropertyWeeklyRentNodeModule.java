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
public class PropertyWeeklyRentNodeModule {

    private final PropertyWeeklyRentNode owner;

    public PropertyWeeklyRentNodeModule(PropertyWeeklyRentNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner PropertyWeeklyRentNode providePropertyWeeklyRentNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner BigDecimalUiNode<?> provideBigDecimalUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ComponentScope PropertyNode providePropertyNode() {
        return owner.getParent();
    }

    @Provides @Named("PropertyWeeklyRentNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<PropertyWeeklyRentNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("PropertyWeeklyRentNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<PropertyWeeklyRentNode> provideTypeRuleProvider(PropertyWeeklyRentNodeRuleProvider provider) {
        return provider;
    }

        @Provides @Named("PropertyWeeklyRentNodeRuleProvider") @IntoMap @StringKey("propertyWeeklyRentNode")
        RuleProvider<PropertyWeeklyRentNode> providePropertyWeeklyRentNodeChildRuleProvider(
            PropertyNodeChildProvider.PropertyWeeklyRentNodeRuleProvider provider
        ) {
            return provider;
        }


    @Provides @ComponentScope
    List<RuleProvider<PropertyWeeklyRentNode>> provideRuleProviders(
        @Named("PropertyWeeklyRentNodeRuleProvider")  Map<String, Provider<RuleProvider<PropertyWeeklyRentNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}