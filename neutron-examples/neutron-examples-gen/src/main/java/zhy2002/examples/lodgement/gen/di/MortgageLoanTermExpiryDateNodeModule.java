package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class MortgageLoanTermExpiryDateNodeModule {

    private final MortgageLoanTermExpiryDateNode owner;

    public MortgageLoanTermExpiryDateNodeModule(MortgageLoanTermExpiryDateNode owner) {
        this.owner = owner;
    }

    @Provides @MortgageLoanTermExpiryDateNodeScope @Owner MortgageLoanTermExpiryDateNode provideMortgageLoanTermExpiryDateNode() {
        return owner;
    }

    @Provides @MortgageLoanTermExpiryDateNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @MortgageLoanTermExpiryDateNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @MortgageLoanTermExpiryDateNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @MortgageLoanTermExpiryDateNodeScope ExistingMortgageNode provideExistingMortgageNode() {
        return owner.getParent();
    }

}