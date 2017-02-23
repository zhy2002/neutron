package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

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
