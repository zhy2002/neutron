package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

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



}