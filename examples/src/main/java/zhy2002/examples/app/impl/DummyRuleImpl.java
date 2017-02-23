package zhy2002.examples.app.impl;


import zhy2002.examples.app.gen.LodgementNode;
import zhy2002.examples.app.gen.di.LodgementNodeScope;
import zhy2002.examples.app.gen.rule.DummyRule;
import zhy2002.neutron.EventBinding;
import zhy2002.neutron.di.Owner;

import javax.inject.Inject;
import java.util.Collection;
import java.util.Collections;

@LodgementNodeScope
public class DummyRuleImpl extends DummyRule {

    @Inject
    public DummyRuleImpl(@Owner LodgementNode owner) {
        super(owner);
    }

    @Override
    protected Collection<EventBinding> createEventBindings() {
        return Collections.emptyList();
    }
}
