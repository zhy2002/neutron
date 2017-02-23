package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class AddressRefUiNodeModule {

    private final AddressRefUiNode owner;

    public AddressRefUiNodeModule(AddressRefUiNode owner) {
        this.owner = owner;
    }

    @Provides @AddressRefUiNodeScope @Owner AddressRefUiNode provideAddressRefUiNode() {
        return owner;
    }

    @Provides @AddressRefUiNodeScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @AddressRefUiNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }



}