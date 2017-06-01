package zhy2002.examples.register.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.register.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class PropertyStateNodeModule {

    private final PropertyStateNode owner;

    public PropertyStateNodeModule(PropertyStateNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner PropertyStateNode providePropertyStateNode() {
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
        return owner.getContext().getNameOfNodeBeingCreated();
    }

    @Provides @ComponentScope PropertyDetailsNode providePropertyDetailsNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<PropertyStateNode> provideRuleProvider(Provider<PropertyStateNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<PropertyStateNode>> provideInstanceProviderMap(
        Provider<PropertyDetailsNodeChildProvider.PropertyStateNodeRuleProvider> propertyStateNodeRuleProvider
    ) {
        Map<String, RuleProvider<PropertyStateNode>> result = new HashMap<>();
        result.put("propertyStateNode", propertyStateNodeRuleProvider.get());
        return result;
    }
}