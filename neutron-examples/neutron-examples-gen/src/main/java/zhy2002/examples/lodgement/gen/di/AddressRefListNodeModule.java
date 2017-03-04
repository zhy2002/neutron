package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class AddressRefListNodeModule {

    private final AddressRefListNode owner;

    public AddressRefListNodeModule(AddressRefListNode owner) {
        this.owner = owner;
    }

    @Provides @AddressRefListNodeScope @Owner AddressRefListNode provideAddressRefListNode() {
        return owner;
    }

    @Provides @AddressRefListNodeScope @Owner ListUiNode<?,?> provideListUiNode() {
        return owner;
    }

    @Provides @AddressRefListNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @AddressRefListNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @AddressRefListNodeScope ApplicationNode provideApplicationNode() {
        return owner.getParent();
    }

}