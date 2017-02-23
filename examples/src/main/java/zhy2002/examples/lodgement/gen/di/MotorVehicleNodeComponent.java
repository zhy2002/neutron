package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

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
