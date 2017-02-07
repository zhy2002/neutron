package zhy2002.examples.app.impl;


import zhy2002.examples.app.di.LodgementContextScope;
import zhy2002.examples.app.gen.rule.DummyRule;
import zhy2002.neutron.ClassRegistryImpl;

import javax.inject.Inject;

@LodgementContextScope
public class LodgementNodeImplClassRegistry extends ClassRegistryImpl {

    @Inject
    public LodgementNodeImplClassRegistry() {

        setUiNodeRuleFactory(DummyRule.class, DummyRuleImpl::new);
    }
}
