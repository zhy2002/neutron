package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@Module(subcomponents = {
    AddressRefUiNodeChildComponent.class
})
@AddressListNodeItemScope
public class AddressListNodeItemModule {

    private final AddressListNode parent;

    public AddressListNodeItemModule(AddressListNode parent) {
        this.parent = parent;
    }

    String getItemName() {
        return String.valueOf(parent.getChildSequenceNumber());
    }

    @Provides
    @AddressListNodeItemScope
    AddressRefUiNode provideAddressRefUiNode(
        MembersInjector<AddressRefUiNode> injector
    ) {
        AddressRefUiNode node = new AddressRefUiNode(parent, getItemName());

        injector.injectMembers(node);
        return node;
    }

}