package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@MotorVehicleNodeScope
@Subcomponent(modules = {MotorVehicleNodeModule.class})
public interface MotorVehicleNodeComponent {

    MotorVehicleNodeRuleProvider getMotorVehicleNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setMotorVehicleNodeModule(MotorVehicleNodeModule module);

        MotorVehicleNodeComponent build();
    }
}
