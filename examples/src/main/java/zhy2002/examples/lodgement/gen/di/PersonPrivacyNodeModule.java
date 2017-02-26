package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class PersonPrivacyNodeModule {

    private final PersonPrivacyNode owner;

    public PersonPrivacyNodeModule(PersonPrivacyNode owner) {
        this.owner = owner;
    }

    @Provides @PersonPrivacyNodeScope @Owner PersonPrivacyNode providePersonPrivacyNode() {
        return owner;
    }

    @Provides @PersonPrivacyNodeScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @PersonPrivacyNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @PersonPrivacyNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}