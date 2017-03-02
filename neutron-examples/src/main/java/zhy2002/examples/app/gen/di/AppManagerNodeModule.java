package zhy2002.examples.app.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.app.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class AppManagerNodeModule {

    private final AppManagerNode owner;

    public AppManagerNodeModule(AppManagerNode owner) {
        this.owner = owner;
    }

    @Provides @AppManagerNodeScope @Owner AppManagerNode provideAppManagerNode() {
        return owner;
    }

    @Provides @AppManagerNodeScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @AppManagerNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @AppManagerNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}