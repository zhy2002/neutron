package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class OtherIncomeAmountNodeModule {

    private final OtherIncomeAmountNode owner;

    public OtherIncomeAmountNodeModule(OtherIncomeAmountNode owner) {
        this.owner = owner;
    }

    @Provides @OtherIncomeAmountNodeScope @Owner OtherIncomeAmountNode provideOtherIncomeAmountNode() {
        return owner;
    }

    @Provides @OtherIncomeAmountNodeScope @Owner BaseCurrencyNode<?> provideBaseCurrencyNode() {
        return owner;
    }

    @Provides @OtherIncomeAmountNodeScope @Owner BigDecimalUiNode<?> provideBigDecimalUiNode() {
        return owner;
    }

    @Provides @OtherIncomeAmountNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @OtherIncomeAmountNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @OtherIncomeAmountNodeScope OtherIncomeNode provideOtherIncomeNode() {
        return owner.getParent();
    }

}