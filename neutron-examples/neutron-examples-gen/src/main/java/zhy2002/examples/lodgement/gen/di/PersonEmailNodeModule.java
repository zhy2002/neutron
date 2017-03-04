package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class PersonEmailNodeModule {

    private final PersonEmailNode owner;

    public PersonEmailNodeModule(PersonEmailNode owner) {
        this.owner = owner;
    }

    @Provides @PersonEmailNodeScope @Owner PersonEmailNode providePersonEmailNode() {
        return owner;
    }

    @Provides @PersonEmailNodeScope @Owner EmailNode<?> provideEmailNode() {
        return owner;
    }

    @Provides @PersonEmailNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @PersonEmailNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @PersonEmailNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @PersonEmailNodeScope PersonContactNode providePersonContactNode() {
        return owner.getParent();
    }

}