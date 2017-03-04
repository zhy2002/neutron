package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class PropertyNodeModule {

    private final PropertyNode owner;

    public PropertyNodeModule(PropertyNode owner) {
        this.owner = owner;
    }

    @Provides @PropertyNodeScope @Owner PropertyNode providePropertyNode() {
        return owner;
    }

    @Provides @PropertyNodeScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @PropertyNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @PropertyNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @PropertyNodeScope RealEstateNode provideRealEstateNode() {
        return owner.getParent();
    }

}