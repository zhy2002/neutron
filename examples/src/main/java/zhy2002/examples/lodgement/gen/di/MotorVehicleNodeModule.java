package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class MotorVehicleNodeModule {

    private final MotorVehicleNode owner;

    public MotorVehicleNodeModule(MotorVehicleNode owner) {
        this.owner = owner;
    }

    @Provides @MotorVehicleNodeScope @Owner MotorVehicleNode provideMotorVehicleNode() {
        return owner;
    }

    @Provides @MotorVehicleNodeScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @MotorVehicleNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @MotorVehicleNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}