package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class PersonTrustAddressNodeModule {

    private final PersonTrustAddressNode owner;

    public PersonTrustAddressNodeModule(PersonTrustAddressNode owner) {
        this.owner = owner;
    }

    @Provides @PersonTrustAddressNodeScope @Owner PersonTrustAddressNode providePersonTrustAddressNode() {
        return owner;
    }

    @Provides @PersonTrustAddressNodeScope @Owner AddressNode<?> provideAddressNode() {
        return owner;
    }

    @Provides @PersonTrustAddressNodeScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @PersonTrustAddressNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @PersonTrustAddressNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}