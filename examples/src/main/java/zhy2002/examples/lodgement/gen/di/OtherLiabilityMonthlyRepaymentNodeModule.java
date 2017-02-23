package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class OtherLiabilityMonthlyRepaymentNodeModule {

    private final OtherLiabilityMonthlyRepaymentNode owner;

    public OtherLiabilityMonthlyRepaymentNodeModule(OtherLiabilityMonthlyRepaymentNode owner) {
        this.owner = owner;
    }

    @Provides @OtherLiabilityMonthlyRepaymentNodeScope @Owner OtherLiabilityMonthlyRepaymentNode provideOtherLiabilityMonthlyRepaymentNode() {
        return owner;
    }

    @Provides @OtherLiabilityMonthlyRepaymentNodeScope @Owner BaseCurrencyNode<?> provideBaseCurrencyNode() {
        return owner;
    }

    @Provides @OtherLiabilityMonthlyRepaymentNodeScope @Owner BigDecimalUiNode<?> provideBigDecimalUiNode() {
        return owner;
    }

    @Provides @OtherLiabilityMonthlyRepaymentNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @OtherLiabilityMonthlyRepaymentNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }



}