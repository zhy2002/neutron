package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class SelectAccountHolderFlagNodeModule {

    private final SelectAccountHolderFlagNode owner;

    public SelectAccountHolderFlagNodeModule(SelectAccountHolderFlagNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner SelectAccountHolderFlagNode provideSelectAccountHolderFlagNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner BooleanUiNode<?> provideBooleanUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ChildName String provideChildName() {
        return owner.getContext().getNodeIdentity().getName();
    }

    @Provides @ComponentScope SelectAccountHolderNode provideSelectAccountHolderNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<SelectAccountHolderFlagNode> provideRuleProvider(Provider<SelectAccountHolderFlagNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<SelectAccountHolderFlagNode>> provideInstanceProviderMap(
        Provider<SelectAccountHolderNodeChildProvider.SelectAccountHolderFlagNodeRuleProvider> selectAccountHolderFlagNodeRuleProvider
    ) {
        Map<String, RuleProvider<SelectAccountHolderFlagNode>> result = new HashMap<>();
        result.put("selectAccountHolderFlagNode", selectAccountHolderFlagNodeRuleProvider.get());
        return result;
    }
}