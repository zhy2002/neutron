package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@VehicleModelNodeScope
@Subcomponent(modules = {VehicleModelNodeModule.class})
public interface VehicleModelNodeComponent {

    RuleProvider<VehicleModelNode> getVehicleModelNodeRuleProvider();
    Map<String, RuleProvider<VehicleModelNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setVehicleModelNodeModule(VehicleModelNodeModule module);

        VehicleModelNodeComponent build();
    }
}
