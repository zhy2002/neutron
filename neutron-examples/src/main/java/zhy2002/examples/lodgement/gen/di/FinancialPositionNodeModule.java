package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class FinancialPositionNodeModule {

    private final FinancialPositionNode owner;

    public FinancialPositionNodeModule(FinancialPositionNode owner) {
        this.owner = owner;
    }

    @Provides @FinancialPositionNodeScope @Owner FinancialPositionNode provideFinancialPositionNode() {
        return owner;
    }

    @Provides @FinancialPositionNodeScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @FinancialPositionNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @FinancialPositionNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}