package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class PersonMitigationMethodNodeModule {

    private final PersonMitigationMethodNode owner;

    public PersonMitigationMethodNodeModule(PersonMitigationMethodNode owner) {
        this.owner = owner;
    }

    @Provides @PersonMitigationMethodNodeScope @Owner PersonMitigationMethodNode providePersonMitigationMethodNode() {
        return owner;
    }

    @Provides @PersonMitigationMethodNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @PersonMitigationMethodNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @PersonMitigationMethodNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}