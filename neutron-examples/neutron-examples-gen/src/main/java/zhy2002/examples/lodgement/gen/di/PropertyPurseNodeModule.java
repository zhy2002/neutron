package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class PropertyPurseNodeModule {

    private final PropertyPurseNode owner;

    public PropertyPurseNodeModule(PropertyPurseNode owner) {
        this.owner = owner;
    }

    @Provides @PropertyPurseNodeScope @Owner PropertyPurseNode providePropertyPurseNode() {
        return owner;
    }

    @Provides @PropertyPurseNodeScope @Owner BooleanUiNode<?> provideBooleanUiNode() {
        return owner;
    }

    @Provides @PropertyPurseNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @PropertyPurseNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @PropertyPurseNodeScope PropertyNode providePropertyNode() {
        return owner.getParent();
    }

    @Provides @PropertyPurseNodeScope
    RuleProvider<PropertyPurseNode> provideRuleProvider(Provider<PropertyPurseNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @PropertyPurseNodeScope
    Map<String, RuleProvider<PropertyPurseNode>> provideInstanceProviderMap(
        Provider<PropertyNodeChildProvider.PropertyPurseNodeRuleProvider> propertyPurseNodeRuleProvider
    ) {
        Map<String, RuleProvider<PropertyPurseNode>> result = new HashMap<>();
        result.put("propertyPurseNode", propertyPurseNodeRuleProvider.get());
        return result;
    }
}