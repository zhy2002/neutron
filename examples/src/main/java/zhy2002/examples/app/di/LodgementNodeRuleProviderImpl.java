package zhy2002.examples.app.di;

import zhy2002.examples.app.gen.LodgementNode;
import zhy2002.examples.app.gen.rule.DummyRule;
import zhy2002.examples.app.gen.rule.LodgementNodeRuleProvider;
import zhy2002.examples.app.impl.DummyRuleImpl;

import javax.inject.Inject;


public class LodgementNodeRuleProviderImpl extends LodgementNodeRuleProvider {

    @Inject
    public LodgementNodeRuleProviderImpl() {
    }

    @Override
    protected DummyRule newDummyRule(LodgementNode node) {
        return new DummyRuleImpl(node);
    }
}
