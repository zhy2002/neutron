package zhy2002.examples.register.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.register.gen.node.*;
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

    @Provides @PropertyAddressNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @PropertyAddressNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @PropertyAddressNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @PropertyAddressNodeScope PropertyDetailsNode providePropertyDetailsNode() {
        return owner.getParent();
    }

    @Provides @PropertyAddressNodeScope
    Map<String, RuleProvider<PropertyAddressNode>> provideInstanceProviders(
        Provider<PropertyDetailsNodeChildProvider.PropertyAddressNodeRuleProvider> propertyAddressNodeRuleProvider
    ) {
        Map<String, RuleProvider<PropertyAddressNode>> result = new HashMap<>();
        result.put("propertyAddressNode", propertyAddressNodeRuleProvider.get());
        return result;
    }
}