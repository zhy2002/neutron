package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class ThirdPartyAddressNodeModule {

    private final ThirdPartyAddressNode owner;

    public ThirdPartyAddressNodeModule(ThirdPartyAddressNode owner) {
        this.owner = owner;
    }

    @Provides @ThirdPartyAddressNodeScope @Owner ThirdPartyAddressNode provideThirdPartyAddressNode() {
        return owner;
    }

    @Provides @ThirdPartyAddressNodeScope @Owner AddressNode<?> provideAddressNode() {
        return owner;
    }

    @Provides @ThirdPartyAddressNodeScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @ThirdPartyAddressNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @ThirdPartyAddressNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}