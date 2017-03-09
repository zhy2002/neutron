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

    @Provides @PropertyOwnershipListNodeScope @Owner PropertyOwnershipListNode providePropertyOwnershipListNode() {
        return owner;
    }

    @Provides @PropertyOwnershipListNodeScope @Owner OwnershipListNode<?> provideOwnershipListNode() {
        return owner;
    }

    @Provides @PropertyOwnershipListNodeScope @Owner ListUiNode<?,?> provideListUiNode() {
        return owner;
    }

    @Provides @PropertyOwnershipListNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @PropertyOwnershipListNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @PropertyOwnershipListNodeScope PropertyNode providePropertyNode() {
        return owner.getParent();
    }

    @Provides @PropertyOwnershipListNodeScope
    Map<String, RuleProvider<PropertyOwnershipListNode>> provideInstanceProviders(
        Provider<PropertyNodeChildProvider.PropertyOwnershipListNodeRuleProvider> propertyOwnershipListNodeRuleProvider
    ) {
        Map<String, RuleProvider<PropertyOwnershipListNode>> result = new HashMap<>();
        result.put("propertyOwnershipListNode", propertyOwnershipListNodeRuleProvider.get());
        return result;
    }
}