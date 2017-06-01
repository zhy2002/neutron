package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {VehicleModelNodeModule.class})
public interface VehicleModelNodeComponent {

    List<RuleProvider<VehicleModelNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setVehicleModelNodeModule(VehicleModelNodeModule module);

        VehicleModelNodeComponent build();
    }

}
