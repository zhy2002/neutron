package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@AddressRefUiNodeChildScope
@Subcomponent(modules = {AddressRefUiNodeChildModule.class})
public interface AddressRefUiNodeChildComponent {


    @Subcomponent.Builder
    interface Builder {

        Builder setAddressRefUiNodeChildModule(AddressRefUiNodeChildModule module);

        AddressRefUiNodeChildComponent build();
    }
}
