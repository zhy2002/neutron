package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {VehicleMarketValueNodeModule.class})
public interface VehicleMarketValueNodeComponent {

    List<RuleProvider<VehicleMarketValueNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setVehicleMarketValueNodeModule(VehicleMarketValueNodeModule module);

        VehicleMarketValueNodeComponent build();
    }

}
