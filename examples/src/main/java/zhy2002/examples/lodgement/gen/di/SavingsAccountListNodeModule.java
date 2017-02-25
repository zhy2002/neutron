package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class SavingsAccountListNodeModule {

    private final SavingsAccountListNode owner;

    public SavingsAccountListNodeModule(SavingsAccountListNode owner) {
        this.owner = owner;
    }

    @Provides @SavingsAccountListNodeScope @Owner SavingsAccountListNode provideSavingsAccountListNode() {
        return owner;
    }

    @Provides @SavingsAccountListNodeScope @Owner ListUiNode<?,?> provideListUiNode() {
        return owner;
    }

    @Provides @SavingsAccountListNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @SavingsAccountListNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}