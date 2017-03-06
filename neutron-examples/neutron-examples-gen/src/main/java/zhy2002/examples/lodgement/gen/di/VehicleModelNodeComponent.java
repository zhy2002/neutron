package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@VehicleModelNodeScope
@Subcomponent(modules = {VehicleModelNodeModule.class})
public interface VehicleModelNodeComponent {

    VehicleModelNodeRuleProvider getVehicleModelNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setVehicleModelNodeModule(VehicleModelNodeModule module);

        VehicleModelNodeComponent build();
    }
}
