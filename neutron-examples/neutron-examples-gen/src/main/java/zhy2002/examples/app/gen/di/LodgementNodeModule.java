package zhy2002.examples.app.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.app.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;


@Module
public class LodgementNodeModule {

    private final LodgementNode owner;

    public LodgementNodeModule(LodgementNode owner) {
        this.owner = owner;
    }

    @Provides @LodgementNodeScope @Owner LodgementNode provideLodgementNode() {
        return owner;
    }

    @Provides @LodgementNodeScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @LodgementNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @LodgementNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}