package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

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

}