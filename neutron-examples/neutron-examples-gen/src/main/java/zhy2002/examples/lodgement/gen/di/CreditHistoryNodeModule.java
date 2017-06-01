package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;


@Module
public class CreditHistoryNodeModule {

    private final CreditHistoryNode owner;

    public CreditHistoryNodeModule(CreditHistoryNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner CreditHistoryNode provideCreditHistoryNode() {
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

    @Provides @ComponentScope CreditHistoryListNode provideCreditHistoryListNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<CreditHistoryNode> provideRuleProvider(Provider<CreditHistoryNodeRuleProvider> provider) {
        return provider.get();
    }

}