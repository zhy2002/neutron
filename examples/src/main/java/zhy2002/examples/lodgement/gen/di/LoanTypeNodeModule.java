package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class LoanTypeNodeModule {

    private final LoanTypeNode owner;

    public LoanTypeNodeModule(LoanTypeNode owner) {
        this.owner = owner;
    }

    @Provides @LoanTypeNodeScope @Owner LoanTypeNode provideLoanTypeNode() {
        return owner;
    }

    @Provides @LoanTypeNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @LoanTypeNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @LoanTypeNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}