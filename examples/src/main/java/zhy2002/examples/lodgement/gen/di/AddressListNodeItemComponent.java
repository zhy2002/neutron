package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@AddressListNodeItemScope
@Subcomponent(modules = {AddressListNodeItemModule.class})
public interface AddressListNodeItemComponent {

    AddressRefUiNode provideAddressRefUiNode();

}
