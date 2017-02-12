package zhy2002.neutron.node;


import zhy2002.neutron.RuleProvider;
import zhy2002.neutron.UiNodeRule;
import zhy2002.neutron.rule.BooleanFixedValueValidationRule;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.Collections;
import java.util.List;

@Singleton
public class BooleanUiNodeRuleProvider implements RuleProvider<BooleanUiNode<?>> {

    @Inject
    public BooleanUiNodeRuleProvider() {
    }

    @Override
    public List<UiNodeRule<BooleanUiNode<?>>> createRules(BooleanUiNode<?> node) {
        return Collections.singletonList(
                new BooleanFixedValueValidationRule(node)
        );
    }
}
