package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class MortgageInterestOnlyExpiryDateNodeModule {

    private final MortgageInterestOnlyExpiryDateNode owner;

    public MortgageInterestOnlyExpiryDateNodeModule(MortgageInterestOnlyExpiryDateNode owner) {
        this.owner = owner;
    }

    @Provides @MortgageInterestOnlyExpiryDateNodeScope @Owner MortgageInterestOnlyExpiryDateNode provideMortgageInterestOnlyExpiryDateNode() {
        return owner;
    }

    @Provides @MortgageInterestOnlyExpiryDateNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @MortgageInterestOnlyExpiryDateNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @MortgageInterestOnlyExpiryDateNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}