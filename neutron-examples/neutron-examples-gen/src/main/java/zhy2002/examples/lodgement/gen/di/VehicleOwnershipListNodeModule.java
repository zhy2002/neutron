package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class VehicleOwnershipListNodeModule {

    private final VehicleOwnershipListNode owner;

    public VehicleOwnershipListNodeModule(VehicleOwnershipListNode owner) {
        this.owner = owner;
    }

    @Provides @VehicleOwnershipListNodeScope @Owner VehicleOwnershipListNode provideVehicleOwnershipListNode() {
        return owner;
    }

    @Provides @VehicleOwnershipListNodeScope @Owner OwnershipListNode<?> provideOwnershipListNode() {
        return owner;
    }

    @Provides @VehicleOwnershipListNodeScope @Owner ListUiNode<?,?> provideListUiNode() {
        return owner;
    }

    @Provides @VehicleOwnershipListNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @VehicleOwnershipListNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @VehicleOwnershipListNodeScope MotorVehicleNode provideMotorVehicleNode() {
        return owner.getParent();
    }

    @Provides @VehicleOwnershipListNodeScope
    Map<String, RuleProvider<VehicleOwnershipListNode>> provideInstanceProviders(
        Provider<MotorVehicleNodeChildProvider.OwnershipListNodeRuleProvider> ownershipListNodeRuleProvider
    ) {
        Map<String, RuleProvider<VehicleOwnershipListNode>> result = new HashMap<>();
        result.put("ownershipListNode", ownershipListNodeRuleProvider.get());
        return result;
    }
}