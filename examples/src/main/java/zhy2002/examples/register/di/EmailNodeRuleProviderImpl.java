package zhy2002.examples.register.di;

import zhy2002.examples.register.gen.EmailNode;
import zhy2002.examples.register.gen.rule.EmailChangeReasonRule;
import zhy2002.examples.register.gen.rule.EmailNodeRuleProvider;
import zhy2002.examples.register.impl.EmailChangeReasonRuleImpl;

import javax.inject.Inject;

public class EmailNodeRuleProviderImpl extends EmailNodeRuleProvider {

    @Inject
    public EmailNodeRuleProviderImpl() {
    }

    @Override
    protected EmailChangeReasonRule newEmailChangeReasonRule(EmailNode node) {
        return new EmailChangeReasonRuleImpl(node);
    }


}
