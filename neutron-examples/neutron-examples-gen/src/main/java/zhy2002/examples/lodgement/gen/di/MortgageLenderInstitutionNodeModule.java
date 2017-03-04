package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class MortgageLenderInstitutionNodeModule {

    private final MortgageLenderInstitutionNode owner;

    public MortgageLenderInstitutionNodeModule(MortgageLenderInstitutionNode owner) {
        this.owner = owner;
    }

    @Provides @MortgageLenderInstitutionNodeScope @Owner MortgageLenderInstitutionNode provideMortgageLenderInstitutionNode() {
        return owner;
    }

    @Provides @MortgageLenderInstitutionNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @MortgageLenderInstitutionNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @MortgageLenderInstitutionNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @MortgageLenderInstitutionNodeScope ExistingMortgageNode provideExistingMortgageNode() {
        return owner.getParent();
    }

}