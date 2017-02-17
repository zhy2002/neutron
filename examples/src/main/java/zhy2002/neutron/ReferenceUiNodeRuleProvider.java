package zhy2002.neutron;

import zhy2002.neutron.rule.ReferenceUiNodeRule;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.Collections;
import java.util.List;

@Singleton
public class ReferenceUiNodeRuleProvider implements RuleProvider<ReferenceUiNode<?>> {

    @Inject
    public ReferenceUiNodeRuleProvider() {
    }

    @Override
    public List<UiNodeRule<ReferenceUiNode<?>>> createRules(ReferenceUiNode<?> node) {
        return Collections.singletonList(
                new ReferenceUiNodeRule(node)
        );
    }
}
