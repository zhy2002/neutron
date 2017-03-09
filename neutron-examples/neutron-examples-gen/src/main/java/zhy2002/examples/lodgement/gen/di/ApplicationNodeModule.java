package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;


@Module
public class ApplicationNodeModule {

    private final ApplicationNode owner;

    public ApplicationNodeModule(ApplicationNode owner) {
        this.owner = owner;
    }

    @Provides @ApplicationNodeScope @Owner ApplicationNode provideApplicationNode() {
        return owner;
    }

    @Provides @ApplicationNodeScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @ApplicationNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @ApplicationNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}