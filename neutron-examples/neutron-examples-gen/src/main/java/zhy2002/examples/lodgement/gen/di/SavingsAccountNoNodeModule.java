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

    @Provides @ComponentScope @Owner SavingsAccountNoNode provideSavingsAccountNoNode() {
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
    RuleProvider<SavingsAccountNoNode> provideRuleProvider(Provider<SavingsAccountNoNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<SavingsAccountNoNode>> provideInstanceProviderMap(
        Provider<SavingsAccountNodeChildProvider.SavingsAccountNoNodeRuleProvider> savingsAccountNoNodeRuleProvider
    ) {
        Map<String, RuleProvider<SavingsAccountNoNode>> result = new HashMap<>();
        result.put("savingsAccountNoNode", savingsAccountNoNodeRuleProvider.get());
        return result;
    }
}