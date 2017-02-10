package zhy2002.neutron.node;

import zhy2002.neutron.RuleProvider;
import zhy2002.neutron.UiNodeRule;
import zhy2002.neutron.rule.InvalidCharPreChangeRule;
import zhy2002.neutron.rule.LengthValidationRule;
import zhy2002.neutron.rule.PatternValidationRule;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.Arrays;
import java.util.List;


@Singleton
public class StringUiNodeRuleProvider implements RuleProvider<StringUiNode<?>> {

    @Inject
    public StringUiNodeRuleProvider() {
    }

    @Override
    public List<UiNodeRule<StringUiNode<?>>> createRules(StringUiNode<?> node) {
        return Arrays.asList(
                new PatternValidationRule(node),
                new LengthValidationRule(node),
                new InvalidCharPreChangeRule(node)
        );
    }
}
