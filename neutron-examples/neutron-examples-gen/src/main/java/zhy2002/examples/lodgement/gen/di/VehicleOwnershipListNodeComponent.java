package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {VehicleOwnershipListNodeModule.class})
public interface VehicleOwnershipListNodeComponent extends OwnershipListNodeComponent {

    List<RuleProvider<VehicleOwnershipListNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setVehicleOwnershipListNodeModule(VehicleOwnershipListNodeModule module);

        VehicleOwnershipListNodeComponent build();
    }

}
