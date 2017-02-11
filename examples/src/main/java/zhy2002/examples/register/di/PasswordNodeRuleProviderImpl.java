package zhy2002.examples.register.di;

import zhy2002.examples.register.gen.PasswordNode;
import zhy2002.examples.register.gen.rule.PasswordIsStrongRule;
import zhy2002.examples.register.gen.rule.PasswordNodeRuleProvider;
import zhy2002.examples.register.impl.PasswordIsStrongRuleImpl;

import javax.inject.Inject;

public class PasswordNodeRuleProviderImpl extends PasswordNodeRuleProvider {

    @Inject
    public PasswordNodeRuleProviderImpl() {
    }

    @Override
    protected PasswordIsStrongRule newPasswordIsStrongRule(PasswordNode node) {
        return new PasswordIsStrongRuleImpl(node);
    }


}
