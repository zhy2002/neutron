package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class AddressRefNodeModule {

    private final AddressRefNode owner;

    public AddressRefNodeModule(AddressRefNode owner) {
        this.owner = owner;
    }

    @Provides @AddressRefNodeScope @Owner AddressRefNode provideAddressRefNode() {
        return owner;
    }

    @Provides @AddressRefNodeScope @Owner ReferenceUiNode<?> provideReferenceUiNode() {
        return owner;
    }

    @Provides @AddressRefNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @AddressRefNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @AddressRefNodeScope AddressRefListNode provideAddressRefListNode() {
        return owner.getParent();
    }

}