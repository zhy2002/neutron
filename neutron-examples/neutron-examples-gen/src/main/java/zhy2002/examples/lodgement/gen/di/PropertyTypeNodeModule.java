package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class PropertyTypeNodeModule {

    private final PropertyTypeNode owner;

    public PropertyTypeNodeModule(PropertyTypeNode owner) {
        this.owner = owner;
    }

    @Provides @PropertyTypeNodeScope @Owner PropertyTypeNode providePropertyTypeNode() {
        return owner;
    }

    @Provides @PropertyTypeNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @PropertyTypeNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @PropertyTypeNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @PropertyTypeNodeScope PropertyNode providePropertyNode() {
        return owner.getParent();
    }

    @Provides @PropertyTypeNodeScope
    RuleProvider<PropertyTypeNode> provideRuleProvider(Provider<PropertyTypeNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @PropertyTypeNodeScope
    Map<String, RuleProvider<PropertyTypeNode>> provideInstanceProviderMap(
        Provider<PropertyNodeChildProvider.PropertyTypeNodeRuleProvider> propertyTypeNodeRuleProvider
    ) {
        Map<String, RuleProvider<PropertyTypeNode>> result = new HashMap<>();
        result.put("propertyTypeNode", propertyTypeNodeRuleProvider.get());
        return result;
    }
}