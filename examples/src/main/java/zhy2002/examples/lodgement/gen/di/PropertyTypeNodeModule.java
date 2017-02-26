package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class PropertyTypeNodeModule {

    private final PropertyTypeNode owner;

    public PropertyTypeNodeModule(PropertyTypeNode owner) {
        this.owner = owner;
    }

    @Provides @PropertyTypeNodeScope @Owner PropertyTypeNode providePropertyTypeNode() {
        return owner;
    }

    @Provides @PropertyTypeNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @PropertyTypeNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @PropertyTypeNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}