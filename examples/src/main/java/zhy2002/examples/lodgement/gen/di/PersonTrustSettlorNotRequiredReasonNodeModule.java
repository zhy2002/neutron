package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class PersonTrustSettlorNotRequiredReasonNodeModule {

    private final PersonTrustSettlorNotRequiredReasonNode owner;

    public PersonTrustSettlorNotRequiredReasonNodeModule(PersonTrustSettlorNotRequiredReasonNode owner) {
        this.owner = owner;
    }

    @Provides @PersonTrustSettlorNotRequiredReasonNodeScope @Owner PersonTrustSettlorNotRequiredReasonNode providePersonTrustSettlorNotRequiredReasonNode() {
        return owner;
    }

    @Provides @PersonTrustSettlorNotRequiredReasonNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @PersonTrustSettlorNotRequiredReasonNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @PersonTrustSettlorNotRequiredReasonNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}