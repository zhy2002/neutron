package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@VehicleOwnershipListNodeScope
@Subcomponent(modules = {VehicleOwnershipListNodeModule.class})
public interface VehicleOwnershipListNodeComponent {

    VehicleOwnershipListNodeRuleProvider getVehicleOwnershipListNodeRuleProvider();
    Map<String, RuleProvider<VehicleOwnershipListNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setVehicleOwnershipListNodeModule(VehicleOwnershipListNodeModule module);

        VehicleOwnershipListNodeComponent build();
    }
}
