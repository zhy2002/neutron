package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class SavingsAccountListNodeModule {

    private final SavingsAccountListNode owner;

    public SavingsAccountListNodeModule(SavingsAccountListNode owner) {
        this.owner = owner;
    }

    @Provides @SavingsAccountListNodeScope @Owner SavingsAccountListNode provideSavingsAccountListNode() {
        return owner;
    }

    @Provides @SavingsAccountListNodeScope @Owner ListUiNode<?,?> provideListUiNode() {
        return owner;
    }

    @Provides @SavingsAccountListNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @SavingsAccountListNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @SavingsAccountListNodeScope AssetsNode provideAssetsNode() {
        return owner.getParent();
    }

    @Provides @SavingsAccountListNodeScope
    Map<String, RuleProvider<SavingsAccountListNode>> provideInstanceProviders(
        Provider<AssetsNodeChildProvider.SavingsAccountListNodeRuleProvider> savingsAccountListNodeRuleProvider
    ) {
        Map<String, RuleProvider<SavingsAccountListNode>> result = new HashMap<>();
        result.put("savingsAccountListNode", savingsAccountListNodeRuleProvider.get());
        return result;
    }
}