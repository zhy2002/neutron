package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class MortgageLoanTypeNodeModule {

    private final MortgageLoanTypeNode owner;

    public MortgageLoanTypeNodeModule(MortgageLoanTypeNode owner) {
        this.owner = owner;
    }

    @Provides @MortgageLoanTypeNodeScope @Owner MortgageLoanTypeNode provideMortgageLoanTypeNode() {
        return owner;
    }

    @Provides @MortgageLoanTypeNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @MortgageLoanTypeNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @MortgageLoanTypeNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @MortgageLoanTypeNodeScope ExistingMortgageNode provideExistingMortgageNode() {
        return owner.getParent();
    }

}