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

    @Provides @ComponentScope @Owner SavingsAccountListNode provideSavingsAccountListNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ListUiNode<?,?> provideListUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ChildName String provideChildName() {
        return owner.getContext().getNameOfNodeBeingCreated();
    }

    @Provides @ComponentScope AssetsNode provideAssetsNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<SavingsAccountListNode> provideRuleProvider(Provider<SavingsAccountListNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<SavingsAccountListNode>> provideInstanceProviderMap(
        Provider<AssetsNodeChildProvider.SavingsAccountListNodeRuleProvider> savingsAccountListNodeRuleProvider
    ) {
        Map<String, RuleProvider<SavingsAccountListNode>> result = new HashMap<>();
        result.put("savingsAccountListNode", savingsAccountListNodeRuleProvider.get());
        return result;
    }
}