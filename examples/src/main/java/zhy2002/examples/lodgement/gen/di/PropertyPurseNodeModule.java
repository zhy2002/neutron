package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class PropertyPurseNodeModule {

    private final PropertyPurseNode owner;

    public PropertyPurseNodeModule(PropertyPurseNode owner) {
        this.owner = owner;
    }

    @Provides @PropertyPurseNodeScope @Owner PropertyPurseNode providePropertyPurseNode() {
        return owner;
    }

    @Provides @PropertyPurseNodeScope @Owner BooleanUiNode<?> provideBooleanUiNode() {
        return owner;
    }

    @Provides @PropertyPurseNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @PropertyPurseNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}