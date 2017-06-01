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

    @Provides @ComponentScope @Owner PropertyNode providePropertyNode() {
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

    @Provides @ChildName String provideChildName() {
        return owner.getContext().getNameOfNodeBeingCreated();
    }

    @Provides @ComponentScope RealEstateNode provideRealEstateNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<PropertyNode> provideRuleProvider(Provider<PropertyNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<PropertyNode>> provideInstanceProviderMap(
        Provider<RealEstateNodeChildProvider.PropertyNodeRuleProvider> propertyNodeRuleProvider
    ) {
        Map<String, RuleProvider<PropertyNode>> result = new HashMap<>();
        result.put("propertyNode", propertyNodeRuleProvider.get());
        return result;
    }
}