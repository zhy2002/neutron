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

    @Provides @ComponentScope @Owner PropertyWeeklyRentNode providePropertyWeeklyRentNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner BigDecimalUiNode<?> provideBigDecimalUiNode() {
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
    RuleProvider<PropertyWeeklyRentNode> provideRuleProvider(Provider<PropertyWeeklyRentNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<PropertyWeeklyRentNode>> provideInstanceProviderMap(
        Provider<PropertyNodeChildProvider.PropertyWeeklyRentNodeRuleProvider> propertyWeeklyRentNodeRuleProvider
    ) {
        Map<String, RuleProvider<PropertyWeeklyRentNode>> result = new HashMap<>();
        result.put("propertyWeeklyRentNode", propertyWeeklyRentNodeRuleProvider.get());
        return result;
    }
}