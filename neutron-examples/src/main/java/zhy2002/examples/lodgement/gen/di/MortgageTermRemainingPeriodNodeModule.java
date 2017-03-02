package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class MortgageTermRemainingPeriodNodeModule {

    private final MortgageTermRemainingPeriodNode owner;

    public MortgageTermRemainingPeriodNodeModule(MortgageTermRemainingPeriodNode owner) {
        this.owner = owner;
    }

    @Provides @MortgageTermRemainingPeriodNodeScope @Owner MortgageTermRemainingPeriodNode provideMortgageTermRemainingPeriodNode() {
        return owner;
    }

    @Provides @MortgageTermRemainingPeriodNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @MortgageTermRemainingPeriodNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @MortgageTermRemainingPeriodNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}