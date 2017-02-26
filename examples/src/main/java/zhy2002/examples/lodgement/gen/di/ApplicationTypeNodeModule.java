package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class ApplicationTypeNodeModule {

    private final ApplicationTypeNode owner;

    public ApplicationTypeNodeModule(ApplicationTypeNode owner) {
        this.owner = owner;
    }

    @Provides @ApplicationTypeNodeScope @Owner ApplicationTypeNode provideApplicationTypeNode() {
        return owner;
    }

    @Provides @ApplicationTypeNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @ApplicationTypeNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ApplicationTypeNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}