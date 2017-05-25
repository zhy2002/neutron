package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;

@MotorVehicleNodeScope
@Subcomponent(modules = {MotorVehicleNodeModule.class})
public interface MotorVehicleNodeComponent {

    RuleProvider<MotorVehicleNode> getMotorVehicleNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setMotorVehicleNodeModule(MotorVehicleNodeModule module);

        MotorVehicleNodeComponent build();
    }
}
