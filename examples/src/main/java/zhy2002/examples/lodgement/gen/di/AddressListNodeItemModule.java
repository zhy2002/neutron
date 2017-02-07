package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@Module(subcomponents = {
})
@AddressListNodeItemScope
public class AddressListNodeItemModule {

    String getItemName() {
        return "";
    }

    @Provides
    @AddressListNodeItemScope
    AddressRefUiNode provideAddressRefUiNode(
        AddressListNode parent,
        MembersInjector<AddressRefUiNode> injector
    ) {
        AddressRefUiNode node = new AddressRefUiNode(parent, getItemName());

        injector.injectMembers(node);
        return node;
    }

}