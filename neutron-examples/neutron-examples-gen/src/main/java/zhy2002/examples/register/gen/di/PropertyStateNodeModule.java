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

    @Provides @PropertyStateNodeScope @Owner PropertyStateNode providePropertyStateNode() {
        return owner;
    }

    @Provides @PropertyStateNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @PropertyStateNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @PropertyStateNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @PropertyStateNodeScope PropertyDetailsNode providePropertyDetailsNode() {
        return owner.getParent();
    }

    @Provides @PropertyStateNodeScope
    Map<String, RuleProvider<PropertyStateNode>> provideInstanceProviders(
        Provider<PropertyDetailsNodeChildProvider.PropertyStateNodeRuleProvider> propertyStateNodeRuleProvider
    ) {
        Map<String, RuleProvider<PropertyStateNode>> result = new HashMap<>();
        result.put("propertyStateNode", propertyStateNodeRuleProvider.get());
        return result;
    }
}