package zhy2002.examples.app.impl;


import zhy2002.examples.app.gen.LodgementNode;
import zhy2002.examples.app.gen.rule.DummyRule;
import zhy2002.neutron.EventBinding;

import java.util.Collection;
import java.util.Collections;

public class DummyRuleImpl extends DummyRule {

    public DummyRuleImpl(LodgementNode owner) {
        super(owner);
    }

    @Override
    protected Collection<EventBinding> createEventBindings() {
        return Collections.emptyList();
    }
}
