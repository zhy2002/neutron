package zhy2002.examples.register.impl;

import zhy2002.examples.register.gen.RegisterNodeContext;
import zhy2002.neutron.ClassRegistryImpl;
import zhy2002.neutron.UiNodeChangeEngine;
import zhy2002.neutron.UniqueIdGenerator;
import zhy2002.neutron.util.RandomUniqueIdGenerator;

import javax.inject.Inject;
import javax.validation.constraints.NotNull;

public class RegisterNodeContextImpl extends RegisterNodeContext {
    @Inject
    public RegisterNodeContextImpl(UiNodeChangeEngine changeEngine, UniqueIdGenerator nodeIdGenerator, @NotNull ClassRegistryImpl implRegistry) {
        super(RandomUniqueIdGenerator.Instance.next(), changeEngine, nodeIdGenerator, implRegistry);
    }
}
