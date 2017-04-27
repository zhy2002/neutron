package zhy2002.neutron.node;

import zhy2002.neutron.LeafUiNodeRuleProvider;
import zhy2002.neutron.RuleProvider;
import zhy2002.neutron.UiNodeRule;
import zhy2002.neutron.rule.LengthValidationRule;
import zhy2002.neutron.rule.PatternValidationRule;

import javax.inject.Inject;
import javax.inject.Provider;
import java.util.List;


public class StringUiNodeRuleProvider implements RuleProvider<StringUiNode<?>> {

    @Inject
    public StringUiNodeRuleProvider() {
    }

    @Inject
    LeafUiNodeRuleProvider parentRuleProvider;

    @Override
    public void initializeState(StringUiNode<?> node) {
        parentRuleProvider.initializeState(node);
    }

    @Inject
    Provider<PatternValidationRule> patternValidationRuleProvider;
    @Inject
    Provider<LengthValidationRule> lengthValidationRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

        createdRules.add(patternValidationRuleProvider.get());
        createdRules.add(lengthValidationRuleProvider.get());
    }
}
