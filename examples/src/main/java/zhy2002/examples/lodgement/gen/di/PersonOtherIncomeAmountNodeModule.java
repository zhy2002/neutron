package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class PersonOtherIncomeAmountNodeModule {

    private final PersonOtherIncomeAmountNode owner;

    public PersonOtherIncomeAmountNodeModule(PersonOtherIncomeAmountNode owner) {
        this.owner = owner;
    }

    @Provides @PersonOtherIncomeAmountNodeScope @Owner PersonOtherIncomeAmountNode providePersonOtherIncomeAmountNode() {
        return owner;
    }

    @Provides @PersonOtherIncomeAmountNodeScope @Owner BaseCurrencyNode<?> provideBaseCurrencyNode() {
        return owner;
    }

    @Provides @PersonOtherIncomeAmountNodeScope @Owner BigDecimalUiNode<?> provideBigDecimalUiNode() {
        return owner;
    }

    @Provides @PersonOtherIncomeAmountNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @PersonOtherIncomeAmountNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }



}