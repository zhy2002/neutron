package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class ContactAddressNodeModule {

    private final ContactAddressNode owner;

    public ContactAddressNodeModule(ContactAddressNode owner) {
        this.owner = owner;
    }

    @Provides @ContactAddressNodeScope @Owner ContactAddressNode provideContactAddressNode() {
        return owner;
    }

    @Provides @ContactAddressNodeScope @Owner AddressNode<?> provideAddressNode() {
        return owner;
    }

    @Provides @ContactAddressNodeScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @ContactAddressNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @ContactAddressNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}