package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class PropertySubTypeNodeModule {

    private final PropertySubTypeNode owner;

    public PropertySubTypeNodeModule(PropertySubTypeNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner PropertySubTypeNode providePropertySubTypeNode() {
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

    @Provides @ComponentScope PropertyNode providePropertyNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<PropertySubTypeNode> provideRuleProvider(Provider<PropertySubTypeNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<PropertySubTypeNode>> provideInstanceProviderMap(
        Provider<PropertyNodeChildProvider.PropertySubTypeNodeRuleProvider> propertySubTypeNodeRuleProvider
    ) {
        Map<String, RuleProvider<PropertySubTypeNode>> result = new HashMap<>();
        result.put("propertySubTypeNode", propertySubTypeNodeRuleProvider.get());
        return result;
    }
}