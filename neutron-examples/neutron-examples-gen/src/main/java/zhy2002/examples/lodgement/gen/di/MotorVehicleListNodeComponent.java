package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {MotorVehicleListNodeModule.class})
public interface MotorVehicleListNodeComponent {

    List<RuleProvider<MotorVehicleListNode>> provideRuleProviders();

    MotorVehicleNode createMotorVehicleNode();

    @Subcomponent.Builder
    interface Builder {

        Builder setMotorVehicleListNodeModule(MotorVehicleListNodeModule module);

        MotorVehicleListNodeComponent build();
    }

}
