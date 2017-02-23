package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class OtherLiabilityBreakCostNodeModule {

    private final OtherLiabilityBreakCostNode owner;

    public OtherLiabilityBreakCostNodeModule(OtherLiabilityBreakCostNode owner) {
        this.owner = owner;
    }

    @Provides @OtherLiabilityBreakCostNodeScope @Owner OtherLiabilityBreakCostNode provideOtherLiabilityBreakCostNode() {
        return owner;
    }

    @Provides @OtherLiabilityBreakCostNodeScope @Owner BaseCurrencyNode<?> provideBaseCurrencyNode() {
        return owner;
    }

    @Provides @OtherLiabilityBreakCostNodeScope @Owner BigDecimalUiNode<?> provideBigDecimalUiNode() {
        return owner;
    }

    @Provides @OtherLiabilityBreakCostNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @OtherLiabilityBreakCostNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }



}