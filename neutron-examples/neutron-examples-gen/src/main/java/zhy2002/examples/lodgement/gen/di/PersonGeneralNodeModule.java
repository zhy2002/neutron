package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class PersonGeneralNodeModule {

    private final PersonGeneralNode owner;

    public PersonGeneralNodeModule(PersonGeneralNode owner) {
        this.owner = owner;
    }

    @Provides @PersonGeneralNodeScope @Owner PersonGeneralNode providePersonGeneralNode() {
        return owner;
    }

    @Provides @PersonGeneralNodeScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @PersonGeneralNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @PersonGeneralNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @PersonGeneralNodeScope PersonNode providePersonNode() {
        return owner.getParent();
    }

}