package zhy2002.examples.register.di;

import zhy2002.examples.register.gen.UsernameNode;
import zhy2002.examples.register.gen.rule.DefaultEmailByUsernameRule;
import zhy2002.examples.register.gen.rule.UsernameNodeRuleProvider;
import zhy2002.examples.register.impl.DefaultEmailByUsernameRuleImpl;

import javax.inject.Inject;

public class UsernameNodeRuleProviderImpl extends UsernameNodeRuleProvider {

    @Inject
    public UsernameNodeRuleProviderImpl() {
    }

    @Override
    protected DefaultEmailByUsernameRule newDefaultEmailByUsernameRule(UsernameNode node) {
        return new DefaultEmailByUsernameRuleImpl(node);
    }


}
