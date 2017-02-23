package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class LoanNodeModule {

    private final LoanNode owner;

    public LoanNodeModule(LoanNode owner) {
        this.owner = owner;
    }

    @Provides @LoanNodeScope @Owner LoanNode provideLoanNode() {
        return owner;
    }

    @Provides @LoanNodeScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @LoanNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }



}