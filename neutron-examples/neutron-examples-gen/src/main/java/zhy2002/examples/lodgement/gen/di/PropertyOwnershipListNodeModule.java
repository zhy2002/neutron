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
public class PropertyOwnershipListNodeModule {

    private final PropertyOwnershipListNode owner;

    public PropertyOwnershipListNodeModule(PropertyOwnershipListNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner PropertyOwnershipListNode providePropertyOwnershipListNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner OwnershipListNode<?> provideOwnershipListNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ListUiNode<?,?> provideListUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ComponentScope PropertyNode providePropertyNode() {
        return owner.getParent();
    }

    @Provides @Named("PropertyOwnershipListNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<PropertyOwnershipListNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("PropertyOwnershipListNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<PropertyOwnershipListNode> provideTypeRuleProvider(PropertyOwnershipListNodeRuleProvider provider) {
        return provider;
    }

        @Provides @Named("PropertyOwnershipListNodeRuleProvider") @IntoMap @StringKey("propertyOwnershipListNode")
        RuleProvider<PropertyOwnershipListNode> providePropertyOwnershipListNodeChildRuleProvider(
            PropertyNodeChildProvider.PropertyOwnershipListNodeRuleProvider provider
        ) {
            return provider;
        }


    @Provides @ComponentScope
    List<RuleProvider<PropertyOwnershipListNode>> provideRuleProviders(
        @Named("PropertyOwnershipListNodeRuleProvider")  Map<String, Provider<RuleProvider<PropertyOwnershipListNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}