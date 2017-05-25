package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class PropertyNodeModule {

    private final PropertyNode owner;

    public PropertyNodeModule(PropertyNode owner) {
        this.owner = owner;
    }

    @Provides @PropertyNodeScope @Owner PropertyNode providePropertyNode() {
        return owner;
    }

    @Provides @PropertyNodeScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @PropertyNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @PropertyNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @PropertyNodeScope RealEstateNode provideRealEstateNode() {
        return owner.getParent();
    }

    @Provides @PropertyNodeScope
    RuleProvider<PropertyNode> provideRuleProvider(Provider<PropertyNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @PropertyNodeScope
    Map<String, RuleProvider<PropertyNode>> provideInstanceProviderMap(
        Provider<RealEstateNodeChildProvider.PropertyNodeRuleProvider> propertyNodeRuleProvider
    ) {
        Map<String, RuleProvider<PropertyNode>> result = new HashMap<>();
        result.put("propertyNode", propertyNodeRuleProvider.get());
        return result;
    }
}