package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class VehicleModelNodeModule {

    private final VehicleModelNode owner;

    public VehicleModelNodeModule(VehicleModelNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner VehicleModelNode provideVehicleModelNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ComponentScope MotorVehicleNode provideMotorVehicleNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<VehicleModelNode> provideRuleProvider(Provider<VehicleModelNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<VehicleModelNode>> provideInstanceProviderMap(
        Provider<MotorVehicleNodeChildProvider.VehicleModelNodeRuleProvider> vehicleModelNodeRuleProvider
    ) {
        Map<String, RuleProvider<VehicleModelNode>> result = new HashMap<>();
        result.put("vehicleModelNode", vehicleModelNodeRuleProvider.get());
        return result;
    }
}