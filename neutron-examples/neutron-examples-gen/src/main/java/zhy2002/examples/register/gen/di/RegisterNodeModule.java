package zhy2002.examples.register.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.register.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;


@Module
public class RegisterNodeModule {

    private final RegisterNode owner;

    public RegisterNodeModule(RegisterNode owner) {
        this.owner = owner;
    }

    @Provides @RegisterNodeScope @Owner RegisterNode provideRegisterNode() {
        return owner;
    }

    @Provides @RegisterNodeScope @Owner RootUiNode<?> provideRootUiNode() {
        return owner;
    }

    @Provides @RegisterNodeScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @RegisterNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @RegisterNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @RegisterNodeScope
    RuleProvider<RegisterNode> provideRuleProvider(Provider<RegisterNodeRuleProvider> provider) {
        return provider.get();
    }

}