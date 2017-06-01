package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;

@ComponentScope
@Subcomponent(modules = {MotorVehicleNodeModule.class})
public interface MotorVehicleNodeComponent {

    VehicleModelNode createVehicleModelNode();
    VehicleYearNode createVehicleYearNode();
    VehicleMarketValueNode createVehicleMarketValueNode();
    VehicleOwnershipListNode createVehicleOwnershipListNode();

    RuleProvider<MotorVehicleNode> getMotorVehicleNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setMotorVehicleNodeModule(MotorVehicleNodeModule module);

        MotorVehicleNodeComponent build();
    }

}
