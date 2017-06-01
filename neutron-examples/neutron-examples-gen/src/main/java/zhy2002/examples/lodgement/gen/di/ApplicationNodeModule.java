package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;


@Module
public class ApplicationNodeModule {

    private final ApplicationNode owner;

    public ApplicationNodeModule(ApplicationNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner ApplicationNode provideApplicationNode() {
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

    @Provides @ComponentScope
    RuleProvider<ApplicationNode> provideRuleProvider(Provider<ApplicationNodeRuleProvider> provider) {
        return provider.get();
    }

}