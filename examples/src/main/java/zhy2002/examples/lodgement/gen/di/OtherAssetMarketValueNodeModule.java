package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class OtherAssetMarketValueNodeModule {

    private final OtherAssetMarketValueNode owner;

    public OtherAssetMarketValueNodeModule(OtherAssetMarketValueNode owner) {
        this.owner = owner;
    }

    @Provides @OtherAssetMarketValueNodeScope @Owner OtherAssetMarketValueNode provideOtherAssetMarketValueNode() {
        return owner;
    }

    @Provides @OtherAssetMarketValueNodeScope @Owner BaseCurrencyNode<?> provideBaseCurrencyNode() {
        return owner;
    }

    @Provides @OtherAssetMarketValueNodeScope @Owner BigDecimalUiNode<?> provideBigDecimalUiNode() {
        return owner;
    }

    @Provides @OtherAssetMarketValueNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @OtherAssetMarketValueNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}