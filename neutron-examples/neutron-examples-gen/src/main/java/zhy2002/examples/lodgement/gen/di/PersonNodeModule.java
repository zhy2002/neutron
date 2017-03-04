package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class PersonNodeModule {

    private final PersonNode owner;

    public PersonNodeModule(PersonNode owner) {
        this.owner = owner;
    }

    @Provides @PersonNodeScope @Owner PersonNode providePersonNode() {
        return owner;
    }

    @Provides @PersonNodeScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @PersonNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @PersonNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @PersonNodeScope PersonListNode providePersonListNode() {
        return owner.getParent();
    }

}