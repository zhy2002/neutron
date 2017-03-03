package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@VehicleYearNodeScope
@Subcomponent(modules = {VehicleYearNodeModule.class})
public interface VehicleYearNodeComponent {

    VehicleYearNodeRuleProvider getVehicleYearNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setVehicleYearNodeModule(VehicleYearNodeModule module);

        VehicleYearNodeComponent build();
    }
}
