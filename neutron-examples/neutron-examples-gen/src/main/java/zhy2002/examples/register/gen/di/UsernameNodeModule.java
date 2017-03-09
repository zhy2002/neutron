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

    @Provides @UsernameNodeScope @Owner UsernameNode provideUsernameNode() {
        return owner;
    }

    @Provides @UsernameNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @UsernameNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @UsernameNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @UsernameNodeScope RegisterNode provideRegisterNode() {
        return owner.getParent();
    }

    @Provides @UsernameNodeScope
    Map<String, RuleProvider<UsernameNode>> provideInstanceProviders(
        Provider<RegisterNodeChildProvider.UsernameNodeRuleProvider> usernameNodeRuleProvider
    ) {
        Map<String, RuleProvider<UsernameNode>> result = new HashMap<>();
        result.put("usernameNode", usernameNodeRuleProvider.get());
        return result;
    }
}