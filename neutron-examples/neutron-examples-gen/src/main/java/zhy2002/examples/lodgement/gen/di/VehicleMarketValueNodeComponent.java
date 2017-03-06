package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@VehicleMarketValueNodeScope
@Subcomponent(modules = {VehicleMarketValueNodeModule.class})
public interface VehicleMarketValueNodeComponent {

    VehicleMarketValueNodeRuleProvider getVehicleMarketValueNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setVehicleMarketValueNodeModule(VehicleMarketValueNodeModule module);

        VehicleMarketValueNodeComponent build();
    }
}
