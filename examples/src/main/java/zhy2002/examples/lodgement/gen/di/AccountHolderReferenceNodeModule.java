package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class AccountHolderReferenceNodeModule {

    private final AccountHolderReferenceNode owner;

    public AccountHolderReferenceNodeModule(AccountHolderReferenceNode owner) {
        this.owner = owner;
    }

    @Provides @AccountHolderReferenceNodeScope @Owner AccountHolderReferenceNode provideAccountHolderReferenceNode() {
        return owner;
    }

    @Provides @AccountHolderReferenceNodeScope @Owner ReferenceUiNode<?> provideReferenceUiNode() {
        return owner;
    }

    @Provides @AccountHolderReferenceNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @AccountHolderReferenceNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}