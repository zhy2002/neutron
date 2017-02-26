package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class PersonContactNodeModule {

    private final PersonContactNode owner;

    public PersonContactNodeModule(PersonContactNode owner) {
        this.owner = owner;
    }

    @Provides @PersonContactNodeScope @Owner PersonContactNode providePersonContactNode() {
        return owner;
    }

    @Provides @PersonContactNodeScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @PersonContactNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @PersonContactNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}