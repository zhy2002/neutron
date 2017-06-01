package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {VehicleYearNodeModule.class})
public interface VehicleYearNodeComponent {

    List<RuleProvider<VehicleYearNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setVehicleYearNodeModule(VehicleYearNodeModule module);

        VehicleYearNodeComponent build();
    }

}
