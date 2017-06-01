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

    @Provides @ComponentScope @Owner ContractPriceNode provideContractPriceNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner BigDecimalUiNode<?> provideBigDecimalUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ChildName String provideChildName() {
        return owner.getContext().getNameOfNodeBeingCreated();
    }

    @Provides @ComponentScope PropertyNode providePropertyNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<ContractPriceNode> provideRuleProvider(Provider<ContractPriceNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<ContractPriceNode>> provideInstanceProviderMap(
        Provider<PropertyNodeChildProvider.ContractPriceNodeRuleProvider> contractPriceNodeRuleProvider
    ) {
        Map<String, RuleProvider<ContractPriceNode>> result = new HashMap<>();
        result.put("contractPriceNode", contractPriceNodeRuleProvider.get());
        return result;
    }
}