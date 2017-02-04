package zhy2002.examples.app.impl;


import zhy2002.examples.app.di.LodgementNodeScope;
import zhy2002.neutron.ClassRegistryImpl;

import javax.inject.Inject;

@LodgementNodeScope
public class LodgementNodeImplClassRegistry extends ClassRegistryImpl {

    @Inject
    public LodgementNodeImplClassRegistry() {
    }
}
