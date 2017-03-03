package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class ExistingMortgageNodeModule {

    private final ExistingMortgageNode owner;

    public ExistingMortgageNodeModule(ExistingMortgageNode owner) {
        this.owner = owner;
    }

    @Provides @ExistingMortgageNodeScope @Owner ExistingMortgageNode provideExistingMortgageNode() {
        return owner;
    }

    @Provides @ExistingMortgageNodeScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @ExistingMortgageNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @ExistingMortgageNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}