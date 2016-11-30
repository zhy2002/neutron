package zhy2002.examples.register.rule.impl;

import zhy2002.examples.register.EmailNode;
import zhy2002.examples.register.rule.EmailChangeReasonRule;

public class EmailChangeReasonRuleImpl extends EmailChangeReasonRule {

    public static class Factory implements EmailChangeReasonRule.Factory {

        @Override
        public EmailChangeReasonRule create(EmailNode owner) {
            return new EmailChangeReasonRuleImpl(owner);
        }
    }

    private EmailChangeReasonRuleImpl(EmailNode owner) {
        super(owner);
    }
}
