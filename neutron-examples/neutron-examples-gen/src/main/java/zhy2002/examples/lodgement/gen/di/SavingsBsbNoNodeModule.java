package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class SavingsBsbNoNodeModule {

    private final SavingsBsbNoNode owner;

    public SavingsBsbNoNodeModule(SavingsBsbNoNode owner) {
        this.owner = owner;
    }

    @Provides @SavingsBsbNoNodeScope @Owner SavingsBsbNoNode provideSavingsBsbNoNode() {
        return owner;
    }

    @Provides @SavingsBsbNoNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @SavingsBsbNoNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @SavingsBsbNoNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @SavingsBsbNoNodeScope SavingsAccountNode provideSavingsAccountNode() {
        return owner.getParent();
    }

    @Provides @SavingsBsbNoNodeScope
    RuleProvider<SavingsBsbNoNode> provideRuleProvider(Provider<SavingsBsbNoNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @SavingsBsbNoNodeScope
    Map<String, RuleProvider<SavingsBsbNoNode>> provideInstanceProviderMap(
        Provider<SavingsAccountNodeChildProvider.SavingsBsbNoNodeRuleProvider> savingsBsbNoNodeRuleProvider
    ) {
        Map<String, RuleProvider<SavingsBsbNoNode>> result = new HashMap<>();
        result.put("savingsBsbNoNode", savingsBsbNoNodeRuleProvider.get());
        return result;
    }
}