package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.impl.*;
import javax.inject.*;
import dagger.MembersInjector;

@Singleton
public class ErrorListNodeRuleProvider implements RuleProvider<ErrorListNode> {

    @Inject
    public ErrorListNodeRuleProvider() {}

    @Inject
    MembersInjector<ChangeFocusErrorRule> changeFocusErrorRuleInjector;

    @Override
    public List<UiNodeRule<ErrorListNode>> createRules(ErrorListNode node) {
        List<UiNodeRule<ErrorListNode>> rules = new ArrayList<>();
        rules.add(createChangeFocusErrorRule(node));
        return rules;
    }

    private ChangeFocusErrorRule createChangeFocusErrorRule(ErrorListNode node) {
        ChangeFocusErrorRule rule = newChangeFocusErrorRule(node);
        changeFocusErrorRuleInjector.injectMembers(rule);
        return rule;
    }


    protected ChangeFocusErrorRule newChangeFocusErrorRule(ErrorListNode node) {
        return new ChangeFocusErrorRuleImpl(node);
    }
}
