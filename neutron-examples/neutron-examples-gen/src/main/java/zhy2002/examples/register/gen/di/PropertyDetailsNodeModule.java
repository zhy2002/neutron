package zhy2002.examples.register.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.register.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class PropertyDetailsNodeModule {

    private final PropertyDetailsNode owner;

    public PropertyDetailsNodeModule(PropertyDetailsNode owner) {
        this.owner = owner;
    }

    @Provides @PropertyDetailsNodeScope @Owner PropertyDetailsNode providePropertyDetailsNode() {
        return owner;
    }

    @Provides @PropertyDetailsNodeScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @PropertyDetailsNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @PropertyDetailsNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @PropertyDetailsNodeScope RegisterNode provideRegisterNode() {
        return owner.getParent();
    }

}