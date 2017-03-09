package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@MotorVehicleListNodeScope
@Subcomponent(modules = {MotorVehicleListNodeModule.class})
public interface MotorVehicleListNodeComponent {

    MotorVehicleListNodeRuleProvider getMotorVehicleListNodeRuleProvider();
    Map<String, RuleProvider<MotorVehicleListNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setMotorVehicleListNodeModule(MotorVehicleListNodeModule module);

        MotorVehicleListNodeComponent build();
    }
}
