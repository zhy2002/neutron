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

    @Provides @SelectAccountHolderFlagNodeScope @Owner SelectAccountHolderFlagNode provideSelectAccountHolderFlagNode() {
        return owner;
    }

    @Provides @SelectAccountHolderFlagNodeScope @Owner BooleanUiNode<?> provideBooleanUiNode() {
        return owner;
    }

    @Provides @SelectAccountHolderFlagNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @SelectAccountHolderFlagNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @SelectAccountHolderFlagNodeScope SelectAccountHolderNode provideSelectAccountHolderNode() {
        return owner.getParent();
    }

    @Provides @SelectAccountHolderFlagNodeScope
    Map<String, RuleProvider<SelectAccountHolderFlagNode>> provideInstanceProviders(
        Provider<SelectAccountHolderNodeChildProvider.SelectAccountHolderFlagNodeRuleProvider> selectAccountHolderFlagNodeRuleProvider
    ) {
        Map<String, RuleProvider<SelectAccountHolderFlagNode>> result = new HashMap<>();
        result.put("selectAccountHolderFlagNode", selectAccountHolderFlagNodeRuleProvider.get());
        return result;
    }
}