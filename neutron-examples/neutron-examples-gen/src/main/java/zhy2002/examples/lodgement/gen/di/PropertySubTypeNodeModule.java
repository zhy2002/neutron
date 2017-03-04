package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class PropertySubTypeNodeModule {

    private final PropertySubTypeNode owner;

    public PropertySubTypeNodeModule(PropertySubTypeNode owner) {
        this.owner = owner;
    }

    @Provides @PropertySubTypeNodeScope @Owner PropertySubTypeNode providePropertySubTypeNode() {
        return owner;
    }

    @Provides @PropertySubTypeNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @PropertySubTypeNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @PropertySubTypeNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @PropertySubTypeNodeScope PropertyNode providePropertyNode() {
        return owner.getParent();
    }

}