package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class SavingsOwnershipListNodeModule {

    private final SavingsOwnershipListNode owner;

    public SavingsOwnershipListNodeModule(SavingsOwnershipListNode owner) {
        this.owner = owner;
    }

    @Provides @SavingsOwnershipListNodeScope @Owner SavingsOwnershipListNode provideSavingsOwnershipListNode() {
        return owner;
    }

    @Provides @SavingsOwnershipListNodeScope @Owner OwnershipListNode<?> provideOwnershipListNode() {
        return owner;
    }

    @Provides @SavingsOwnershipListNodeScope @Owner ListUiNode<?,?> provideListUiNode() {
        return owner;
    }

    @Provides @SavingsOwnershipListNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @SavingsOwnershipListNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @SavingsOwnershipListNodeScope SavingsAccountNode provideSavingsAccountNode() {
        return owner.getParent();
    }

    @Provides @SavingsOwnershipListNodeScope
    RuleProvider<SavingsOwnershipListNode> provideRuleProvider(Provider<SavingsOwnershipListNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @SavingsOwnershipListNodeScope
    Map<String, RuleProvider<SavingsOwnershipListNode>> provideInstanceProviderMap(
        Provider<SavingsAccountNodeChildProvider.OwnershipListNodeRuleProvider> ownershipListNodeRuleProvider
    ) {
        Map<String, RuleProvider<SavingsOwnershipListNode>> result = new HashMap<>();
        result.put("ownershipListNode", ownershipListNodeRuleProvider.get());
        return result;
    }
}