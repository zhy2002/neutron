package zhy2002.neutron;

import zhy2002.neutron.rule.ClearErrorsForDisabledNodeRule;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.Collections;
import java.util.List;

@Singleton
public class UiNodeRuleProvider implements RuleProvider<UiNode<?>> {

    @Inject
    public UiNodeRuleProvider() {}

    @Override
    public List<UiNodeRule<UiNode<?>>> createRules(UiNode<?> node) {
        return Collections.singletonList(
                new ClearErrorsForDisabledNodeRule(node)
        );
    }
}
