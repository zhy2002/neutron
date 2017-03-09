package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class VehicleYearNodeModule {

    private final VehicleYearNode owner;

    public VehicleYearNodeModule(VehicleYearNode owner) {
        this.owner = owner;
    }

    @Provides @VehicleYearNodeScope @Owner VehicleYearNode provideVehicleYearNode() {
        return owner;
    }

    @Provides @VehicleYearNodeScope @Owner BigDecimalUiNode<?> provideBigDecimalUiNode() {
        return owner;
    }

    @Provides @VehicleYearNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @VehicleYearNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @VehicleYearNodeScope MotorVehicleNode provideMotorVehicleNode() {
        return owner.getParent();
    }

    @Provides @VehicleYearNodeScope
    Map<String, RuleProvider<VehicleYearNode>> provideInstanceProviders(
        Provider<MotorVehicleNodeChildProvider.VehicleYearNodeRuleProvider> vehicleYearNodeRuleProvider
    ) {
        Map<String, RuleProvider<VehicleYearNode>> result = new HashMap<>();
        result.put("vehicleYearNode", vehicleYearNodeRuleProvider.get());
        return result;
    }
}