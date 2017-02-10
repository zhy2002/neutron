package zhy2002.neutron;


import zhy2002.neutron.rule.LeafValueRequiredValidationRule;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.Collections;
import java.util.List;

@Singleton
public class LeafUiNodeRuleProvider implements RuleProvider<LeafUiNode<?, ?>> {

    @Inject
    public LeafUiNodeRuleProvider() {
    }

    @Override
    public List<UiNodeRule<LeafUiNode<?, ?>>> createRules(LeafUiNode<?, ?> node) {
        return Collections.singletonList(
                new LeafValueRequiredValidationRule(node)
        );
    }
}
