package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class AddressListNodeModule {

    private final AddressListNode owner;

    public AddressListNodeModule(AddressListNode owner) {
        this.owner = owner;
    }

    @Provides @AddressListNodeScope @Owner AddressListNode provideAddressListNode() {
        return owner;
    }

    @Provides @AddressListNodeScope @Owner ListUiNode<?,?> provideListUiNode() {
        return owner;
    }

    @Provides @AddressListNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @AddressListNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}