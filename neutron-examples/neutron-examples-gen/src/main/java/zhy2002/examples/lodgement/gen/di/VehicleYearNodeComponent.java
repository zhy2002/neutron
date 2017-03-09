package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@VehicleYearNodeScope
@Subcomponent(modules = {VehicleYearNodeModule.class})
public interface VehicleYearNodeComponent {

    VehicleYearNodeRuleProvider getVehicleYearNodeRuleProvider();
    Map<String, RuleProvider<VehicleYearNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setVehicleYearNodeModule(VehicleYearNodeModule module);

        VehicleYearNodeComponent build();
    }
}
