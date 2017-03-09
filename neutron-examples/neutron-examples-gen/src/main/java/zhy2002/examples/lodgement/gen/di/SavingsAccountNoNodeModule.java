package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class SavingsAccountNoNodeModule {

    private final SavingsAccountNoNode owner;

    public SavingsAccountNoNodeModule(SavingsAccountNoNode owner) {
        this.owner = owner;
    }

    @Provides @SavingsAccountNoNodeScope @Owner SavingsAccountNoNode provideSavingsAccountNoNode() {
        return owner;
    }

    @Provides @SavingsAccountNoNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @SavingsAccountNoNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @SavingsAccountNoNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @SavingsAccountNoNodeScope SavingsAccountNode provideSavingsAccountNode() {
        return owner.getParent();
    }

    @Provides @SavingsAccountNoNodeScope
    Map<String, RuleProvider<SavingsAccountNoNode>> provideInstanceProviders(
        Provider<SavingsAccountNodeChildProvider.SavingsAccountNoNodeRuleProvider> savingsAccountNoNodeRuleProvider
    ) {
        Map<String, RuleProvider<SavingsAccountNoNode>> result = new HashMap<>();
        result.put("savingsAccountNoNode", savingsAccountNoNodeRuleProvider.get());
        return result;
    }
}