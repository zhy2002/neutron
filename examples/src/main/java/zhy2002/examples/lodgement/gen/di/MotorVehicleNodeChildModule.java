package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@Module(subcomponents = {
})
@MotorVehicleNodeChildScope
public class MotorVehicleNodeChildModule {


    @Provides
    @MotorVehicleNodeChildScope
    @Named("vehicleModelNode")
    VehicleModelNode provideVehicleModelNode(
        MotorVehicleNode parent,
        MembersInjector<VehicleModelNode> injector
    ) {
        VehicleModelNode node = new VehicleModelNode(parent, "vehicleModelNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @MotorVehicleNodeChildScope
    @Named("vehicleYearNode")
    VehicleYearNode provideVehicleYearNode(
        MotorVehicleNode parent,
        MembersInjector<VehicleYearNode> injector
    ) {
        VehicleYearNode node = new VehicleYearNode(parent, "vehicleYearNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @MotorVehicleNodeChildScope
    @Named("vehicleMarketValueNode")
    VehicleMarketValueNode provideVehicleMarketValueNode(
        MotorVehicleNode parent,
        MembersInjector<VehicleMarketValueNode> injector
    ) {
        VehicleMarketValueNode node = new VehicleMarketValueNode(parent, "vehicleMarketValueNode");

        injector.injectMembers(node);
        return node;
    }

}