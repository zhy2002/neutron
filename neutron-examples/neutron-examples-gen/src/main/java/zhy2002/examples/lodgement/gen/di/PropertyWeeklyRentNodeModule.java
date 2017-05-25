package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class PropertyWeeklyRentNodeModule {

    private final PropertyWeeklyRentNode owner;

    public PropertyWeeklyRentNodeModule(PropertyWeeklyRentNode owner) {
        this.owner = owner;
    }

    @Provides @PropertyWeeklyRentNodeScope @Owner PropertyWeeklyRentNode providePropertyWeeklyRentNode() {
        return owner;
    }

    @Provides @PropertyWeeklyRentNodeScope @Owner BigDecimalUiNode<?> provideBigDecimalUiNode() {
        return owner;
    }

    @Provides @PropertyWeeklyRentNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @PropertyWeeklyRentNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @PropertyWeeklyRentNodeScope PropertyNode providePropertyNode() {
        return owner.getParent();
    }

    @Provides @PropertyWeeklyRentNodeScope
    RuleProvider<PropertyWeeklyRentNode> provideRuleProvider(Provider<PropertyWeeklyRentNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @PropertyWeeklyRentNodeScope
    Map<String, RuleProvider<PropertyWeeklyRentNode>> provideInstanceProviderMap(
        Provider<PropertyNodeChildProvider.PropertyWeeklyRentNodeRuleProvider> propertyWeeklyRentNodeRuleProvider
    ) {
        Map<String, RuleProvider<PropertyWeeklyRentNode>> result = new HashMap<>();
        result.put("propertyWeeklyRentNode", propertyWeeklyRentNodeRuleProvider.get());
        return result;
    }
}