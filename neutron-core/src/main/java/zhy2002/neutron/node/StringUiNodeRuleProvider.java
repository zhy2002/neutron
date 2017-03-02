package zhy2002.neutron.node;

import zhy2002.neutron.LeafUiNodeRuleProvider;
import zhy2002.neutron.UiNodeRule;
import zhy2002.neutron.rule.InvalidCharPreChangeRule;
import zhy2002.neutron.rule.LengthValidationRule;
import zhy2002.neutron.rule.PatternValidationRule;

import javax.inject.Inject;
import javax.inject.Provider;
import java.util.List;


public abstract class StringUiNodeRuleProvider<N extends StringUiNode<?>> extends LeafUiNodeRuleProvider<N> {

    @Inject
    Provider<PatternValidationRule> patternValidationRuleProvider;
    @Inject
    Provider<LengthValidationRule> lengthValidationRuleProvider;
    @Inject
    Provider<InvalidCharPreChangeRule> invalidCharPreChangeRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

        createdRules.add(patternValidationRuleProvider.get());
        createdRules.add(lengthValidationRuleProvider.get());
        createdRules.add(invalidCharPreChangeRuleProvider.get());
    }
}
