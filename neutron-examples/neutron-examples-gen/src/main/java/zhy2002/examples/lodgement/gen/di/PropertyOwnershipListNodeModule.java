package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class PropertyOwnershipListNodeModule {

    private final PropertyOwnershipListNode owner;

    public PropertyOwnershipListNodeModule(PropertyOwnershipListNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner PropertyOwnershipListNode providePropertyOwnershipListNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner OwnershipListNode<?> provideOwnershipListNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ListUiNode<?,?> provideListUiNode() {
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

    @Provides @ComponentScope PropertyNode providePropertyNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<PropertyOwnershipListNode> provideRuleProvider(Provider<PropertyOwnershipListNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<PropertyOwnershipListNode>> provideInstanceProviderMap(
        Provider<PropertyNodeChildProvider.PropertyOwnershipListNodeRuleProvider> propertyOwnershipListNodeRuleProvider
    ) {
        Map<String, RuleProvider<PropertyOwnershipListNode>> result = new HashMap<>();
        result.put("propertyOwnershipListNode", propertyOwnershipListNodeRuleProvider.get());
        return result;
    }
}