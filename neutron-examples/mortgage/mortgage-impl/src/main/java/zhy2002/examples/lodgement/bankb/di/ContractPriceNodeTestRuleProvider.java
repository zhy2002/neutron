package zhy2002.examples.lodgement.bankb.di;

import zhy2002.examples.lodgement.gen.node.ContractPriceNode;
import zhy2002.neutron.RuleProvider;
import zhy2002.neutron.UiNodeRule;

import javax.inject.Inject;
import javax.inject.Provider;
import java.util.List;


public class ContractPriceNodeTestRuleProvider implements RuleProvider<ContractPriceNode> {

    @Inject
    public ContractPriceNodeTestRuleProvider() {}

    @Override
    public void initializeState(ContractPriceNode node) {

    }

    @Inject
    Provider<UpdateEstimatedMarketValueRule> updateEstimatedMarketValueRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        createdRules.add(updateEstimatedMarketValueRuleProvider.get());
    }
}
