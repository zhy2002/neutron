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

    @Provides @ComponentScope @Owner CreditHistoryListNode provideCreditHistoryListNode() {
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
        return owner.getContext().getNodeIdentity().getName();
    }

    @Provides @ComponentScope BasePrivacyNode<?> provideBasePrivacyNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<CreditHistoryListNode> provideRuleProvider(Provider<CreditHistoryListNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<CreditHistoryListNode>> provideInstanceProviderMap(
        Provider<BasePrivacyNodeChildProvider.CreditHistoryListNodeRuleProvider> creditHistoryListNodeRuleProvider
    ) {
        Map<String, RuleProvider<CreditHistoryListNode>> result = new HashMap<>();
        result.put("creditHistoryListNode", creditHistoryListNodeRuleProvider.get());
        return result;
    }
}