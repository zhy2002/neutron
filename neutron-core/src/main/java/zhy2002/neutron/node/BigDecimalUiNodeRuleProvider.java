package zhy2002.neutron.node;

import zhy2002.neutron.LeafUiNodeRuleProvider;
import zhy2002.neutron.RuleProvider;
import zhy2002.neutron.UiNodeRule;
import zhy2002.neutron.rule.NumberFormatValidationRule;
import zhy2002.neutron.rule.RangeValidationRule;

import javax.inject.Inject;
import javax.inject.Provider;
import java.util.List;

public class BigDecimalUiNodeRuleProvider implements RuleProvider<BigDecimalUiNode<?>> {

    @Inject
    public BigDecimalUiNodeRuleProvider() {
    }

    @Inject
    LeafUiNodeRuleProvider parentRuleProvider;

    @Override
    public void initializeState(BigDecimalUiNode<?> node) {
        parentRuleProvider.initializeState(node);

    }

    @Inject
    Provider<RangeValidationRule> rangeValidationRuleProvider;

    @Inject
    Provider<NumberFormatValidationRule> numberFormatValidationRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

        createdRules.add(rangeValidationRuleProvider.get());
        createdRules.add(numberFormatValidationRuleProvider.get());
    }
}
