package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class ContactTelephoneNodeModule {

    private final ContactTelephoneNode owner;

    public ContactTelephoneNodeModule(ContactTelephoneNode owner) {
        this.owner = owner;
    }

    @Provides @ContactTelephoneNodeScope @Owner ContactTelephoneNode provideContactTelephoneNode() {
        return owner;
    }

    @Provides @ContactTelephoneNodeScope @Owner TelephoneNode<?> provideTelephoneNode() {
        return owner;
    }

    @Provides @ContactTelephoneNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ContactTelephoneNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}