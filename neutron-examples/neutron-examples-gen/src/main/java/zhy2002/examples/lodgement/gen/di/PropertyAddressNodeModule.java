package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class PropertyAddressNodeModule {

    private final PropertyAddressNode owner;

    public PropertyAddressNodeModule(PropertyAddressNode owner) {
        this.owner = owner;
    }

    @Provides @PropertyAddressNodeScope @Owner PropertyAddressNode providePropertyAddressNode() {
        return owner;
    }

    @Provides @PropertyAddressNodeScope @Owner AddressNode<?> provideAddressNode() {
        return owner;
    }

    @Provides @PropertyAddressNodeScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @PropertyAddressNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @PropertyAddressNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @PropertyAddressNodeScope PropertyNode providePropertyNode() {
        return owner.getParent();
    }

    @Provides @PropertyAddressNodeScope
    RuleProvider<PropertyAddressNode> provideRuleProvider(Provider<PropertyAddressNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @PropertyAddressNodeScope
    Map<String, RuleProvider<PropertyAddressNode>> provideInstanceProviderMap(
        Provider<PropertyNodeChildProvider.PropertyAddressNodeRuleProvider> propertyAddressNodeRuleProvider
    ) {
        Map<String, RuleProvider<PropertyAddressNode>> result = new HashMap<>();
        result.put("propertyAddressNode", propertyAddressNodeRuleProvider.get());
        return result;
    }
}