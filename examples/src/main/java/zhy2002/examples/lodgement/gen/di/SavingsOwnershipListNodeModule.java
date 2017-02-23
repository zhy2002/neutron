package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class SavingsOwnershipListNodeModule {

    private final SavingsOwnershipListNode owner;

    public SavingsOwnershipListNodeModule(SavingsOwnershipListNode owner) {
        this.owner = owner;
    }

    @Provides @SavingsOwnershipListNodeScope @Owner SavingsOwnershipListNode provideSavingsOwnershipListNode() {
        return owner;
    }

    @Provides @SavingsOwnershipListNodeScope @Owner OwnershipListNode<?> provideOwnershipListNode() {
        return owner;
    }

    @Provides @SavingsOwnershipListNodeScope @Owner ListUiNode<?,?> provideListUiNode() {
        return owner;
    }

    @Provides @SavingsOwnershipListNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }



}