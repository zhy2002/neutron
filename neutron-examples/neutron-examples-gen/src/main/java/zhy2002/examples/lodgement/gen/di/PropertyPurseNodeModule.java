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

    @Provides @ComponentScope @Owner PropertyPurseNode providePropertyPurseNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner BooleanUiNode<?> provideBooleanUiNode() {
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

    @Provides @ComponentScope PropertyNode providePropertyNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<PropertyPurseNode> provideRuleProvider(Provider<PropertyPurseNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<PropertyPurseNode>> provideInstanceProviderMap(
        Provider<PropertyNodeChildProvider.PropertyPurseNodeRuleProvider> propertyPurseNodeRuleProvider
    ) {
        Map<String, RuleProvider<PropertyPurseNode>> result = new HashMap<>();
        result.put("propertyPurseNode", propertyPurseNodeRuleProvider.get());
        return result;
    }
}