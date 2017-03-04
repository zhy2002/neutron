package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class ExistingMortgageListNodeModule {

    private final ExistingMortgageListNode owner;

    public ExistingMortgageListNodeModule(ExistingMortgageListNode owner) {
        this.owner = owner;
    }

    @Provides @ExistingMortgageListNodeScope @Owner ExistingMortgageListNode provideExistingMortgageListNode() {
        return owner;
    }

    @Provides @ExistingMortgageListNodeScope @Owner ListUiNode<?,?> provideListUiNode() {
        return owner;
    }

    @Provides @ExistingMortgageListNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @ExistingMortgageListNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ExistingMortgageListNodeScope UsageNode provideUsageNode() {
        return owner.getParent();
    }

}