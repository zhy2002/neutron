package zhy2002.examples.lodgement.di;

import zhy2002.examples.lodgement.gen.ApplicationNode;
import zhy2002.examples.lodgement.gen.rule.ApplicationNodeRuleProvider;
import zhy2002.examples.lodgement.gen.rule.CreateErrorNodeRule;
import zhy2002.examples.lodgement.gen.rule.ShowErrorListRule;
import zhy2002.examples.lodgement.impl.CreateErrorNodeRuleImpl;
import zhy2002.examples.lodgement.impl.ShowErrorListRuleImpl;

import javax.inject.Inject;


public class ApplicationNodeRuleProviderImpl extends ApplicationNodeRuleProvider {

    @Inject
    public ApplicationNodeRuleProviderImpl() {}

    @Override
    protected CreateErrorNodeRule newCreateErrorNodeRule(ApplicationNode node) {
        return new CreateErrorNodeRuleImpl(node);
    }

    @Override
    protected ShowErrorListRule newShowErrorListRule(ApplicationNode node) {
        return new ShowErrorListRuleImpl(node);
    }
}
