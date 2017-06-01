package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class VehicleYearNodeModule {

    private final VehicleYearNode owner;

    public VehicleYearNodeModule(VehicleYearNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner VehicleYearNode provideVehicleYearNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner BigDecimalUiNode<?> provideBigDecimalUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ChildName String provideChildName() {
        return owner.getContext().getNameOfNodeBeingCreated();
    }

    @Provides @ComponentScope MotorVehicleNode provideMotorVehicleNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<VehicleYearNode> provideRuleProvider(Provider<VehicleYearNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<VehicleYearNode>> provideInstanceProviderMap(
        Provider<MotorVehicleNodeChildProvider.VehicleYearNodeRuleProvider> vehicleYearNodeRuleProvider
    ) {
        Map<String, RuleProvider<VehicleYearNode>> result = new HashMap<>();
        result.put("vehicleYearNode", vehicleYearNodeRuleProvider.get());
        return result;
    }
}