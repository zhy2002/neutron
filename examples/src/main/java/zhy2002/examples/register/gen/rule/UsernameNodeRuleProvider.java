package zhy2002.examples.register.gen.rule;

import zhy2002.neutron.*;
import java.util.*;
import zhy2002.examples.register.gen.*;
import zhy2002.examples.register.impl.*;
import javax.inject.*;
import dagger.MembersInjector;

@Singleton
public class UsernameNodeRuleProvider implements RuleProvider<UsernameNode> {

    @Inject
    public UsernameNodeRuleProvider() {}

    @Inject
    MembersInjector<DefaultEmailByUsernameRule> defaultEmailByUsernameRuleInjector;

    @Override
    public List<UiNodeRule<UsernameNode>> createRules(UsernameNode node) {
        List<UiNodeRule<UsernameNode>> rules = new ArrayList<>();
        rules.add(createDefaultEmailByUsernameRule(node));
        return rules;
    }

    private DefaultEmailByUsernameRule createDefaultEmailByUsernameRule(UsernameNode node) {
        DefaultEmailByUsernameRule rule = newDefaultEmailByUsernameRule(node);
        defaultEmailByUsernameRuleInjector.injectMembers(rule);
        return rule;
    }


    protected DefaultEmailByUsernameRule newDefaultEmailByUsernameRule(UsernameNode node) {
        return new DefaultEmailByUsernameRuleImpl(node);
    }
}
