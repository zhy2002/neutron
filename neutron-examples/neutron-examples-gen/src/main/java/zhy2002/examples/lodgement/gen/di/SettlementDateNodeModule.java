package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class SettlementDateNodeModule {

    private final SettlementDateNode owner;

    public SettlementDateNodeModule(SettlementDateNode owner) {
        this.owner = owner;
    }

    @Provides @SettlementDateNodeScope @Owner SettlementDateNode provideSettlementDateNode() {
        return owner;
    }

    @Provides @SettlementDateNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @SettlementDateNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @SettlementDateNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @SettlementDateNodeScope ProductsNode provideProductsNode() {
        return owner.getParent();
    }

    @Provides @SettlementDateNodeScope
    RuleProvider<SettlementDateNode> provideRuleProvider(Provider<SettlementDateNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @SettlementDateNodeScope
    Map<String, RuleProvider<SettlementDateNode>> provideInstanceProviderMap(
        Provider<ProductsNodeChildProvider.SettlementDateNodeRuleProvider> settlementDateNodeRuleProvider
    ) {
        Map<String, RuleProvider<SettlementDateNode>> result = new HashMap<>();
        result.put("settlementDateNode", settlementDateNodeRuleProvider.get());
        return result;
    }
}