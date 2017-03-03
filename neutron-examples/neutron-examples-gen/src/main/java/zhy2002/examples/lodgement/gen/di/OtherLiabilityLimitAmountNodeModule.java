package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class OtherLiabilityLimitAmountNodeModule {

    private final OtherLiabilityLimitAmountNode owner;

    public OtherLiabilityLimitAmountNodeModule(OtherLiabilityLimitAmountNode owner) {
        this.owner = owner;
    }

    @Provides @OtherLiabilityLimitAmountNodeScope @Owner OtherLiabilityLimitAmountNode provideOtherLiabilityLimitAmountNode() {
        return owner;
    }

    @Provides @OtherLiabilityLimitAmountNodeScope @Owner BaseCurrencyNode<?> provideBaseCurrencyNode() {
        return owner;
    }

    @Provides @OtherLiabilityLimitAmountNodeScope @Owner BigDecimalUiNode<?> provideBigDecimalUiNode() {
        return owner;
    }

    @Provides @OtherLiabilityLimitAmountNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @OtherLiabilityLimitAmountNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}