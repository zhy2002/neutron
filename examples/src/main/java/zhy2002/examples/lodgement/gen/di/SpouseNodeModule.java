package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class SpouseNodeModule {

    private final SpouseNode owner;

    public SpouseNodeModule(SpouseNode owner) {
        this.owner = owner;
    }

    @Provides @SpouseNodeScope @Owner SpouseNode provideSpouseNode() {
        return owner;
    }

    @Provides @SpouseNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @SpouseNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @SpouseNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}