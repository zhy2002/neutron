package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class SavingsTypeNodeModule {

    private final SavingsTypeNode owner;

    public SavingsTypeNodeModule(SavingsTypeNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner SavingsTypeNode provideSavingsTypeNode() {
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

    @Provides @ComponentScope SavingsAccountNode provideSavingsAccountNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<SavingsTypeNode> provideRuleProvider(Provider<SavingsTypeNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<SavingsTypeNode>> provideInstanceProviderMap(
        Provider<SavingsAccountNodeChildProvider.SavingsTypeNodeRuleProvider> savingsTypeNodeRuleProvider
    ) {
        Map<String, RuleProvider<SavingsTypeNode>> result = new HashMap<>();
        result.put("savingsTypeNode", savingsTypeNodeRuleProvider.get());
        return result;
    }
}