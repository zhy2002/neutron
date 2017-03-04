package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class PersonTelephoneNodeModule {

    private final PersonTelephoneNode owner;

    public PersonTelephoneNodeModule(PersonTelephoneNode owner) {
        this.owner = owner;
    }

    @Provides @PersonTelephoneNodeScope @Owner PersonTelephoneNode providePersonTelephoneNode() {
        return owner;
    }

    @Provides @PersonTelephoneNodeScope @Owner TelephoneNode<?> provideTelephoneNode() {
        return owner;
    }

    @Provides @PersonTelephoneNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @PersonTelephoneNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @PersonTelephoneNodeScope PersonContactNode providePersonContactNode() {
        return owner.getParent();
    }

}