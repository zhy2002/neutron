package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class SavingsAccountNameNodeModule {

    private final SavingsAccountNameNode owner;

    public SavingsAccountNameNodeModule(SavingsAccountNameNode owner) {
        this.owner = owner;
    }

    @Provides @SavingsAccountNameNodeScope @Owner SavingsAccountNameNode provideSavingsAccountNameNode() {
        return owner;
    }

    @Provides @SavingsAccountNameNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @SavingsAccountNameNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @SavingsAccountNameNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @SavingsAccountNameNodeScope SavingsAccountNode provideSavingsAccountNode() {
        return owner.getParent();
    }

    @Provides @SavingsAccountNameNodeScope
    RuleProvider<SavingsAccountNameNode> provideRuleProvider(Provider<SavingsAccountNameNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @SavingsAccountNameNodeScope
    Map<String, RuleProvider<SavingsAccountNameNode>> provideInstanceProviderMap(
        Provider<SavingsAccountNodeChildProvider.SavingsAccountNameNodeRuleProvider> savingsAccountNameNodeRuleProvider
    ) {
        Map<String, RuleProvider<SavingsAccountNameNode>> result = new HashMap<>();
        result.put("savingsAccountNameNode", savingsAccountNameNodeRuleProvider.get());
        return result;
    }
}