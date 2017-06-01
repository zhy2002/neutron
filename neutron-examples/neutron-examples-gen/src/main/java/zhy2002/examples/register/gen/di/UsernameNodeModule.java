package zhy2002.examples.register.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.register.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class UsernameNodeModule {

    private final UsernameNode owner;

    public UsernameNodeModule(UsernameNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner UsernameNode provideUsernameNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ChildName String provideChildName() {
        return owner.getContext().getNodeIdentity().getName();
    }

    @Provides @ComponentScope RegisterNode provideRegisterNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<UsernameNode> provideRuleProvider(Provider<UsernameNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<UsernameNode>> provideInstanceProviderMap(
        Provider<RegisterNodeChildProvider.UsernameNodeRuleProvider> usernameNodeRuleProvider
    ) {
        Map<String, RuleProvider<UsernameNode>> result = new HashMap<>();
        result.put("usernameNode", usernameNodeRuleProvider.get());
        return result;
    }
}