package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class PersonTrustRegistrationDateNodeModule {

    private final PersonTrustRegistrationDateNode owner;

    public PersonTrustRegistrationDateNodeModule(PersonTrustRegistrationDateNode owner) {
        this.owner = owner;
    }

    @Provides @PersonTrustRegistrationDateNodeScope @Owner PersonTrustRegistrationDateNode providePersonTrustRegistrationDateNode() {
        return owner;
    }

    @Provides @PersonTrustRegistrationDateNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @PersonTrustRegistrationDateNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @PersonTrustRegistrationDateNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}