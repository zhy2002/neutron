package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class GenderNodeModule {

    private final GenderNode owner;

    public GenderNodeModule(GenderNode owner) {
        this.owner = owner;
    }

    @Provides @GenderNodeScope @Owner GenderNode provideGenderNode() {
        return owner;
    }

    @Provides @GenderNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @GenderNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @GenderNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}