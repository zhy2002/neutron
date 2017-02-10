package zhy2002.neutron.node;

import zhy2002.neutron.RuleProvider;
import zhy2002.neutron.UiNodeRule;
import zhy2002.neutron.rule.NumberFormatValidationRule;
import zhy2002.neutron.rule.RangeValidationRule;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.Arrays;
import java.util.List;


@Singleton
public class BigDecimalUiNodeRuleProvider implements RuleProvider<BigDecimalUiNode<?>> {

    @Inject
    public BigDecimalUiNodeRuleProvider() {
    }

    @Override
    public List<UiNodeRule<BigDecimalUiNode<?>>> createRules(BigDecimalUiNode<?> node) {
        return Arrays.asList(
                new RangeValidationRule(node),
                new NumberFormatValidationRule(node)
        );
    }
}
