package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class VehicleMarketValueNodeModule {

    private final VehicleMarketValueNode owner;

    public VehicleMarketValueNodeModule(VehicleMarketValueNode owner) {
        this.owner = owner;
    }

    @Provides @VehicleMarketValueNodeScope @Owner VehicleMarketValueNode provideVehicleMarketValueNode() {
        return owner;
    }

    @Provides @VehicleMarketValueNodeScope @Owner BaseCurrencyNode<?> provideBaseCurrencyNode() {
        return owner;
    }

    @Provides @VehicleMarketValueNodeScope @Owner BigDecimalUiNode<?> provideBigDecimalUiNode() {
        return owner;
    }

    @Provides @VehicleMarketValueNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @VehicleMarketValueNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @VehicleMarketValueNodeScope MotorVehicleNode provideMotorVehicleNode() {
        return owner.getParent();
    }

    @Provides @VehicleMarketValueNodeScope
    Map<String, RuleProvider<VehicleMarketValueNode>> provideInstanceProviders(
        Provider<MotorVehicleNodeChildProvider.VehicleMarketValueNodeRuleProvider> vehicleMarketValueNodeRuleProvider
    ) {
        Map<String, RuleProvider<VehicleMarketValueNode>> result = new HashMap<>();
        result.put("vehicleMarketValueNode", vehicleMarketValueNodeRuleProvider.get());
        return result;
    }
}