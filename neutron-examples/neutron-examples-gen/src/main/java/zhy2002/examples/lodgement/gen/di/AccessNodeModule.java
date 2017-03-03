package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class AccessNodeModule {

    private final AccessNode owner;

    public AccessNodeModule(AccessNode owner) {
        this.owner = owner;
    }

    @Provides @AccessNodeScope @Owner AccessNode provideAccessNode() {
        return owner;
    }

    @Provides @AccessNodeScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @AccessNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @AccessNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}