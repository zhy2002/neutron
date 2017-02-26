package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class MotorVehicleListNodeModule {

    private final MotorVehicleListNode owner;

    public MotorVehicleListNodeModule(MotorVehicleListNode owner) {
        this.owner = owner;
    }

    @Provides @MotorVehicleListNodeScope @Owner MotorVehicleListNode provideMotorVehicleListNode() {
        return owner;
    }

    @Provides @MotorVehicleListNodeScope @Owner ListUiNode<?,?> provideListUiNode() {
        return owner;
    }

    @Provides @MotorVehicleListNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @MotorVehicleListNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}