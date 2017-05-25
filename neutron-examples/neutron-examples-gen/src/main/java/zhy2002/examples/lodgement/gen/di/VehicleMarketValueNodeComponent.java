package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@VehicleMarketValueNodeScope
@Subcomponent(modules = {VehicleMarketValueNodeModule.class})
public interface VehicleMarketValueNodeComponent {

    RuleProvider<VehicleMarketValueNode> getVehicleMarketValueNodeRuleProvider();
    Map<String, RuleProvider<VehicleMarketValueNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setVehicleMarketValueNodeModule(VehicleMarketValueNodeModule module);

        VehicleMarketValueNodeComponent build();
    }
}
