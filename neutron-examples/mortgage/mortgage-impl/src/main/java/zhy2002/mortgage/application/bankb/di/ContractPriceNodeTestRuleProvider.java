package zhy2002.mortgage.application.bankb.di;

import zhy2002.mortgage.application.gen.node.ContractPriceNode;
import zhy2002.neutron.core.RuleProvider;
import zhy2002.neutron.core.UiNodeRule;

import javax.inject.Inject;
import javax.inject.Provider;
import java.util.List;


public class ContractPriceNodeTestRuleProvider implements RuleProvider<ContractPriceNode> {

    @Inject
    public ContractPriceNodeTestRuleProvider() {}

    @Inject
    Provider<UpdateEstimatedMarketValueRule> updateEstimatedMarketValueRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        createdRules.add(updateEstimatedMarketValueRuleProvider.get());
    }
}
