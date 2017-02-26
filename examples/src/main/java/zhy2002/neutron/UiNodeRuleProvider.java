package zhy2002.neutron;

import zhy2002.neutron.rule.ClearErrorsForDisabledNodeRule;

import javax.inject.Inject;
import javax.inject.Provider;
import java.util.List;

public abstract class UiNodeRuleProvider<N extends UiNode<?>> implements RuleProvider<N> {

    @Inject
    Provider<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        createdRules.add(clearErrorsForDisabledNodeRuleProvider.get());
    }
}