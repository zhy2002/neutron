package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class ContractPriceNodeModule {

    private final ContractPriceNode owner;

    public ContractPriceNodeModule(ContractPriceNode owner) {
        this.owner = owner;
    }

    @Provides @ContractPriceNodeScope @Owner ContractPriceNode provideContractPriceNode() {
        return owner;
    }

    @Provides @ContractPriceNodeScope @Owner BigDecimalUiNode<?> provideBigDecimalUiNode() {
        return owner;
    }

    @Provides @ContractPriceNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ContractPriceNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ContractPriceNodeScope PropertyNode providePropertyNode() {
        return owner.getParent();
    }

    @Provides @ContractPriceNodeScope
    Map<String, RuleProvider<ContractPriceNode>> provideInstanceProviders(
        Provider<PropertyNodeChildProvider.ContractPriceNodeRuleProvider> contractPriceNodeRuleProvider
    ) {
        Map<String, RuleProvider<ContractPriceNode>> result = new HashMap<>();
        result.put("contractPriceNode", contractPriceNodeRuleProvider.get());
        return result;
    }
}