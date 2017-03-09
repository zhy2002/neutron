package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class VehicleModelNodeModule {

    private final VehicleModelNode owner;

    public VehicleModelNodeModule(VehicleModelNode owner) {
        this.owner = owner;
    }

    @Provides @VehicleModelNodeScope @Owner VehicleModelNode provideVehicleModelNode() {
        return owner;
    }

    @Provides @VehicleModelNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @VehicleModelNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @VehicleModelNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @VehicleModelNodeScope MotorVehicleNode provideMotorVehicleNode() {
        return owner.getParent();
    }

    @Provides @VehicleModelNodeScope
    Map<String, RuleProvider<VehicleModelNode>> provideInstanceProviders(
        Provider<MotorVehicleNodeChildProvider.VehicleModelNodeRuleProvider> vehicleModelNodeRuleProvider
    ) {
        Map<String, RuleProvider<VehicleModelNode>> result = new HashMap<>();
        result.put("vehicleModelNode", vehicleModelNodeRuleProvider.get());
        return result;
    }
}