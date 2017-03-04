package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class PersonAddressNodeModule {

    private final PersonAddressNode owner;

    public PersonAddressNodeModule(PersonAddressNode owner) {
        this.owner = owner;
    }

    @Provides @PersonAddressNodeScope @Owner PersonAddressNode providePersonAddressNode() {
        return owner;
    }

    @Provides @PersonAddressNodeScope @Owner AddressNode<?> provideAddressNode() {
        return owner;
    }

    @Provides @PersonAddressNodeScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @PersonAddressNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @PersonAddressNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @PersonAddressNodeScope PersonContactNode providePersonContactNode() {
        return owner.getParent();
    }

}