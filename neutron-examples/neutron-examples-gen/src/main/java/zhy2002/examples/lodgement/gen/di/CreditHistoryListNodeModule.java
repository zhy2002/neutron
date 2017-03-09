package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class CreditHistoryListNodeModule {

    private final CreditHistoryListNode owner;

    public CreditHistoryListNodeModule(CreditHistoryListNode owner) {
        this.owner = owner;
    }

    @Provides @CreditHistoryListNodeScope @Owner CreditHistoryListNode provideCreditHistoryListNode() {
        return owner;
    }

    @Provides @CreditHistoryListNodeScope @Owner ListUiNode<?,?> provideListUiNode() {
        return owner;
    }

    @Provides @CreditHistoryListNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @CreditHistoryListNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @CreditHistoryListNodeScope BasePrivacyNode<?> provideBasePrivacyNode() {
        return owner.getParent();
    }

    @Provides @CreditHistoryListNodeScope
    Map<String, RuleProvider<CreditHistoryListNode>> provideInstanceProviders(
        Provider<BasePrivacyNodeChildProvider.CreditHistoryListNodeRuleProvider> creditHistoryListNodeRuleProvider
    ) {
        Map<String, RuleProvider<CreditHistoryListNode>> result = new HashMap<>();
        result.put("creditHistoryListNode", creditHistoryListNodeRuleProvider.get());
        return result;
    }
}