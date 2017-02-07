package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@Module(subcomponents = {
})
@AddressRefUiNodeChildScope
public class AddressRefUiNodeChildModule {

    private final AddressRefUiNode parent;

    public AddressRefUiNodeChildModule(AddressRefUiNode parent) {
        this.parent = parent;
    }


}