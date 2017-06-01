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

    @Provides @ComponentScope @Owner VehicleMarketValueNode provideVehicleMarketValueNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner BaseCurrencyNode<?> provideBaseCurrencyNode() {
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
    RuleProvider<VehicleMarketValueNode> provideRuleProvider(Provider<VehicleMarketValueNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<VehicleMarketValueNode>> provideInstanceProviderMap(
        Provider<MotorVehicleNodeChildProvider.VehicleMarketValueNodeRuleProvider> vehicleMarketValueNodeRuleProvider
    ) {
        Map<String, RuleProvider<VehicleMarketValueNode>> result = new HashMap<>();
        result.put("vehicleMarketValueNode", vehicleMarketValueNodeRuleProvider.get());
        return result;
    }
}