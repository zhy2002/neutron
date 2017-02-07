package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@Module(subcomponents = {
})
@MotorVehicleNodeChildScope
public class MotorVehicleNodeChildModule {

    private final MotorVehicleNode parent;

    public MotorVehicleNodeChildModule(MotorVehicleNode parent) {
        this.parent = parent;
    }


    @Provides
    @MotorVehicleNodeChildScope
    @Named("vehicleModelNode")
    VehicleModelNode provideVehicleModelNode(
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
        MembersInjector<VehicleMarketValueNode> injector
    ) {
        VehicleMarketValueNode node = new VehicleMarketValueNode(parent, "vehicleMarketValueNode");

        injector.injectMembers(node);
        return node;
    }

}