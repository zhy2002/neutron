package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@MotorVehicleListNodeScope
@Subcomponent(modules = {MotorVehicleListNodeModule.class})
public interface MotorVehicleListNodeComponent {

    MotorVehicleListNodeRuleProvider getMotorVehicleListNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setMotorVehicleListNodeModule(MotorVehicleListNodeModule module);

        MotorVehicleListNodeComponent build();
    }
}
