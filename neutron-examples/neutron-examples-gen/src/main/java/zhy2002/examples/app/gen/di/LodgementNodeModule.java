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

    @Provides @ComponentScope @Owner LodgementNode provideLodgementNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner RootUiNode<?> provideRootUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ChildName String provideChildName() {
        return owner.getContext().getNodeIdentity().getName();
    }

    @Provides @ComponentScope
    RuleProvider<LodgementNode> provideRuleProvider(Provider<LodgementNodeRuleProvider> provider) {
        return provider.get();
    }

}