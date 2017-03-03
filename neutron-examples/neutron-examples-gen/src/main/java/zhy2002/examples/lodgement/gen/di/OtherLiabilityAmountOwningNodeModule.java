package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class OtherLiabilityAmountOwningNodeModule {

    private final OtherLiabilityAmountOwningNode owner;

    public OtherLiabilityAmountOwningNodeModule(OtherLiabilityAmountOwningNode owner) {
        this.owner = owner;
    }

    @Provides @OtherLiabilityAmountOwningNodeScope @Owner OtherLiabilityAmountOwningNode provideOtherLiabilityAmountOwningNode() {
        return owner;
    }

    @Provides @OtherLiabilityAmountOwningNodeScope @Owner BaseCurrencyNode<?> provideBaseCurrencyNode() {
        return owner;
    }

    @Provides @OtherLiabilityAmountOwningNodeScope @Owner BigDecimalUiNode<?> provideBigDecimalUiNode() {
        return owner;
    }

    @Provides @OtherLiabilityAmountOwningNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @OtherLiabilityAmountOwningNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}