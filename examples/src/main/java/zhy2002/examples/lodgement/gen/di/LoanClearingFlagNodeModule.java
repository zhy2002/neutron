package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class LoanClearingFlagNodeModule {

    private final LoanClearingFlagNode owner;

    public LoanClearingFlagNodeModule(LoanClearingFlagNode owner) {
        this.owner = owner;
    }

    @Provides @LoanClearingFlagNodeScope @Owner LoanClearingFlagNode provideLoanClearingFlagNode() {
        return owner;
    }

    @Provides @LoanClearingFlagNodeScope @Owner BooleanUiNode<?> provideBooleanUiNode() {
        return owner;
    }

    @Provides @LoanClearingFlagNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @LoanClearingFlagNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}