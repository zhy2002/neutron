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

    @Provides @ChildName String provideChildName() {
        return owner.getContext().getNodeIdentity().getName();
    }

    @Provides @ComponentScope PropertyDetailsNode providePropertyDetailsNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<PropertyAddressNode> provideRuleProvider(Provider<PropertyAddressNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<PropertyAddressNode>> provideInstanceProviderMap(
        Provider<PropertyDetailsNodeChildProvider.PropertyAddressNodeRuleProvider> propertyAddressNodeRuleProvider
    ) {
        Map<String, RuleProvider<PropertyAddressNode>> result = new HashMap<>();
        result.put("propertyAddressNode", propertyAddressNodeRuleProvider.get());
        return result;
    }
}