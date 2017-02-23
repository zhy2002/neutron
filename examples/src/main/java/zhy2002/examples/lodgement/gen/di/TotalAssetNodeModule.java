package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class TotalAssetNodeModule {

    private final TotalAssetNode owner;

    public TotalAssetNodeModule(TotalAssetNode owner) {
        this.owner = owner;
    }

    @Provides @TotalAssetNodeScope @Owner TotalAssetNode provideTotalAssetNode() {
        return owner;
    }

    @Provides @TotalAssetNodeScope @Owner BaseCurrencyNode<?> provideBaseCurrencyNode() {
        return owner;
    }

    @Provides @TotalAssetNodeScope @Owner BigDecimalUiNode<?> provideBigDecimalUiNode() {
        return owner;
    }

    @Provides @TotalAssetNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @TotalAssetNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }



}