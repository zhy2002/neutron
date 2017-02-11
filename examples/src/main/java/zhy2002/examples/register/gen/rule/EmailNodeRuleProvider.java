package zhy2002.examples.register.gen.rule;

import zhy2002.neutron.*;
import java.util.*;
import zhy2002.examples.register.gen.*;
import zhy2002.examples.register.impl.*;
import javax.inject.*;
import dagger.MembersInjector;

@Singleton
public class EmailNodeRuleProvider implements RuleProvider<EmailNode> {

    @Inject
    public EmailNodeRuleProvider() {}

    @Inject
    MembersInjector<EmailChangeReasonRule> emailChangeReasonRuleInjector;

    @Override
    public List<UiNodeRule<EmailNode>> createRules(EmailNode node) {
        List<UiNodeRule<EmailNode>> rules = new ArrayList<>();
        rules.add(createEmailChangeReasonRule(node));
        return rules;
    }

    private EmailChangeReasonRule createEmailChangeReasonRule(EmailNode node) {
        EmailChangeReasonRule rule = newEmailChangeReasonRule(node);
        emailChangeReasonRuleInjector.injectMembers(rule);
        return rule;
    }


    protected EmailChangeReasonRule newEmailChangeReasonRule(EmailNode node) {
        return new EmailChangeReasonRuleImpl(node);
    }
}
