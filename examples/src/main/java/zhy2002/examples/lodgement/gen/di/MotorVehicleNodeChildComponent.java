package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@MotorVehicleNodeChildScope
@Subcomponent(modules = {MotorVehicleNodeChildModule.class})
public interface MotorVehicleNodeChildComponent {

    VehicleModelNode provideVehicleModelNode(@Named("vehicleModelNode") VehicleModelNode impl);
    VehicleYearNode provideVehicleYearNode(@Named("vehicleYearNode") VehicleYearNode impl);
    VehicleMarketValueNode provideVehicleMarketValueNode(@Named("vehicleMarketValueNode") VehicleMarketValueNode impl);

    @Subcomponent.Builder
    interface Builder {

        Builder setMotorVehicleNodeChildModule(MotorVehicleNodeChildModule module);

        MotorVehicleNodeChildComponent build();
    }
}
