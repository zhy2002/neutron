package zhy2002.examples.register.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.register.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class PasswordNodeModule {

    private final PasswordNode owner;

    public PasswordNodeModule(PasswordNode owner) {
        this.owner = owner;
    }

    @Provides @PasswordNodeScope @Owner PasswordNode providePasswordNode() {
        return owner;
    }

    @Provides @PasswordNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @PasswordNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @PasswordNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @PasswordNodeScope RegisterNode provideRegisterNode() {
        return owner.getParent();
    }

    @Provides @PasswordNodeScope
    RuleProvider<PasswordNode> provideRuleProvider(Provider<PasswordNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @PasswordNodeScope
    Map<String, RuleProvider<PasswordNode>> provideInstanceProviderMap(
        Provider<RegisterNodeChildProvider.PasswordNodeRuleProvider> passwordNodeRuleProvider
    ) {
        Map<String, RuleProvider<PasswordNode>> result = new HashMap<>();
        result.put("passwordNode", passwordNodeRuleProvider.get());
        return result;
    }
}