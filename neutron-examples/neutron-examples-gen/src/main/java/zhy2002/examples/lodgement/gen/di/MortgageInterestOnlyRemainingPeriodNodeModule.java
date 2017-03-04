package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class MortgageInterestOnlyRemainingPeriodNodeModule {

    private final MortgageInterestOnlyRemainingPeriodNode owner;

    public MortgageInterestOnlyRemainingPeriodNodeModule(MortgageInterestOnlyRemainingPeriodNode owner) {
        this.owner = owner;
    }

    @Provides @MortgageInterestOnlyRemainingPeriodNodeScope @Owner MortgageInterestOnlyRemainingPeriodNode provideMortgageInterestOnlyRemainingPeriodNode() {
        return owner;
    }

    @Provides @MortgageInterestOnlyRemainingPeriodNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @MortgageInterestOnlyRemainingPeriodNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @MortgageInterestOnlyRemainingPeriodNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @MortgageInterestOnlyRemainingPeriodNodeScope ExistingMortgageNode provideExistingMortgageNode() {
        return owner.getParent();
    }

}