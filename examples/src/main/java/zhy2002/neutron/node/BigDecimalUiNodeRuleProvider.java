package zhy2002.neutron.node;

import zhy2002.neutron.LeafUiNodeRuleProvider;
import zhy2002.neutron.UiNodeRule;
import zhy2002.neutron.rule.NumberFormatValidationRule;
import zhy2002.neutron.rule.RangeValidationRule;

import javax.inject.Inject;
import javax.inject.Provider;
import java.util.List;

public abstract class BigDecimalUiNodeRuleProvider<N extends BigDecimalUiNode<?>> extends LeafUiNodeRuleProvider<N> {

    @Inject
    Provider<RangeValidationRule> rangeValidationRuleProvider;
    @Inject
    Provider<NumberFormatValidationRule> numberFormatValidationRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

        createdRules.add(rangeValidationRuleProvider.get());
        createdRules.add(numberFormatValidationRuleProvider.get());
    }
}
