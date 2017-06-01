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

    @Provides @ComponentScope @Owner SavingsBsbNoNode provideSavingsBsbNoNode() {
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
        return owner.getContext().getNameOfNodeBeingCreated();
    }

    @Provides @ComponentScope SavingsAccountNode provideSavingsAccountNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<SavingsBsbNoNode> provideRuleProvider(Provider<SavingsBsbNoNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<SavingsBsbNoNode>> provideInstanceProviderMap(
        Provider<SavingsAccountNodeChildProvider.SavingsBsbNoNodeRuleProvider> savingsBsbNoNodeRuleProvider
    ) {
        Map<String, RuleProvider<SavingsBsbNoNode>> result = new HashMap<>();
        result.put("savingsBsbNoNode", savingsBsbNoNodeRuleProvider.get());
        return result;
    }
}