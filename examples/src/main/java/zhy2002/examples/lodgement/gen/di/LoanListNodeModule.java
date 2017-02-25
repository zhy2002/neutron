package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class LoanListNodeModule {

    private final LoanListNode owner;

    public LoanListNodeModule(LoanListNode owner) {
        this.owner = owner;
    }

    @Provides @LoanListNodeScope @Owner LoanListNode provideLoanListNode() {
        return owner;
    }

    @Provides @LoanListNodeScope @Owner ListUiNode<?,?> provideListUiNode() {
        return owner;
    }

    @Provides @LoanListNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @LoanListNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}