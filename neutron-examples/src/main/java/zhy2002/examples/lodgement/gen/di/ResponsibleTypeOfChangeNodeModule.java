package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class ResponsibleTypeOfChangeNodeModule {

    private final ResponsibleTypeOfChangeNode owner;

    public ResponsibleTypeOfChangeNodeModule(ResponsibleTypeOfChangeNode owner) {
        this.owner = owner;
    }

    @Provides @ResponsibleTypeOfChangeNodeScope @Owner ResponsibleTypeOfChangeNode provideResponsibleTypeOfChangeNode() {
        return owner;
    }

    @Provides @ResponsibleTypeOfChangeNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @ResponsibleTypeOfChangeNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ResponsibleTypeOfChangeNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}