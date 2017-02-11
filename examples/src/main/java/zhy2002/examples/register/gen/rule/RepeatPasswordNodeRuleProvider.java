package zhy2002.examples.register.gen.rule;

import zhy2002.neutron.*;
import java.util.*;
import zhy2002.examples.register.gen.*;
import zhy2002.examples.register.impl.*;
import javax.inject.*;
import dagger.MembersInjector;

@Singleton
public class RepeatPasswordNodeRuleProvider implements RuleProvider<RepeatPasswordNode> {

    @Inject
    public RepeatPasswordNodeRuleProvider() {}

    @Inject
    MembersInjector<RepeatPasswordRule> repeatPasswordRuleInjector;

    @Override
    public List<UiNodeRule<RepeatPasswordNode>> createRules(RepeatPasswordNode node) {
        List<UiNodeRule<RepeatPasswordNode>> rules = new ArrayList<>();
        rules.add(createRepeatPasswordRule(node));
        return rules;
    }

    private RepeatPasswordRule createRepeatPasswordRule(RepeatPasswordNode node) {
        RepeatPasswordRule rule = newRepeatPasswordRule(node);
        repeatPasswordRuleInjector.injectMembers(rule);
        return rule;
    }


    protected RepeatPasswordRule newRepeatPasswordRule(RepeatPasswordNode node) {
        return new RepeatPasswordRuleImpl(node);
    }
}
