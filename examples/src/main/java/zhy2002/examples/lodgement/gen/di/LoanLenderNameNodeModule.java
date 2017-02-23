package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class LoanLenderNameNodeModule {

    private final LoanLenderNameNode owner;

    public LoanLenderNameNodeModule(LoanLenderNameNode owner) {
        this.owner = owner;
    }

    @Provides @LoanLenderNameNodeScope @Owner LoanLenderNameNode provideLoanLenderNameNode() {
        return owner;
    }

    @Provides @LoanLenderNameNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @LoanLenderNameNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @LoanLenderNameNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }



}