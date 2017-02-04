package zhy2002.examples.app.impl;

import zhy2002.examples.app.di.LodgementNodeScope;
import zhy2002.examples.app.gen.LodgementNodeContext;
import zhy2002.neutron.ClassRegistryImpl;
import zhy2002.neutron.UiNodeChangeEngine;
import zhy2002.neutron.UniqueIdGenerator;
import zhy2002.neutron.util.RandomUniqueIdGenerator;

import javax.inject.Inject;
import javax.validation.constraints.NotNull;

@LodgementNodeScope
public class LodgementNodeContextImpl extends LodgementNodeContext {
    @Inject
    public LodgementNodeContextImpl(UiNodeChangeEngine changeEngine, UniqueIdGenerator nodeIdGenerator, @NotNull ClassRegistryImpl implRegistry) {
        super(RandomUniqueIdGenerator.Instance.next(), changeEngine, nodeIdGenerator, implRegistry);
    }
}
