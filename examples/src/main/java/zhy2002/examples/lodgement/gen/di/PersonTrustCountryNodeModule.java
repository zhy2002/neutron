package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class PersonTrustCountryNodeModule {

    private final PersonTrustCountryNode owner;

    public PersonTrustCountryNodeModule(PersonTrustCountryNode owner) {
        this.owner = owner;
    }

    @Provides @PersonTrustCountryNodeScope @Owner PersonTrustCountryNode providePersonTrustCountryNode() {
        return owner;
    }

    @Provides @PersonTrustCountryNodeScope @Owner BaseCountryNode<?> provideBaseCountryNode() {
        return owner;
    }

    @Provides @PersonTrustCountryNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @PersonTrustCountryNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @PersonTrustCountryNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}