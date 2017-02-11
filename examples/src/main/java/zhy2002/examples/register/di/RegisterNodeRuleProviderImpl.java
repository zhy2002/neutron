package zhy2002.examples.register.di;

import zhy2002.examples.register.gen.RegisterNode;
import zhy2002.examples.register.gen.rule.CreateErrorNodeRule;
import zhy2002.examples.register.gen.rule.RegisterNodeRuleProvider;
import zhy2002.examples.register.gen.rule.SetHasErrorRule;
import zhy2002.examples.register.impl.CreateErrorNodeRuleImpl;
import zhy2002.examples.register.impl.SetHasErrorRuleImpl;
import javax.inject.Inject;


public class RegisterNodeRuleProviderImpl extends RegisterNodeRuleProvider {

    @Inject
    public RegisterNodeRuleProviderImpl() {
    }

    @Override
    protected SetHasErrorRule newSetHasErrorRule(RegisterNode node) {
        return new SetHasErrorRuleImpl(node);
    }

    @Override
    protected CreateErrorNodeRule newCreateErrorNodeRule(RegisterNode node) {
        return new CreateErrorNodeRuleImpl(node);
    }


}
