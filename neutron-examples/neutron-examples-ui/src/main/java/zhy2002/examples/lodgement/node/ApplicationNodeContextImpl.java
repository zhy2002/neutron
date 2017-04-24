package zhy2002.examples.lodgement.node;

import zhy2002.examples.lodgement.gen.ApplicationNodeContext;
import zhy2002.neutron.event.EventRegistryImpl;
import zhy2002.neutron.UiNodeChangeEngine;
import zhy2002.neutron.UniqueIdGenerator;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.validation.constraints.NotNull;

@Singleton
public class ApplicationNodeContextImpl extends ApplicationNodeContext {

    @Inject
    public ApplicationNodeContextImpl(
            UiNodeChangeEngine changeEngine,
            UniqueIdGenerator nodeIdGenerator,
            @NotNull EventRegistryImpl implRegistry
    ) {
        super(changeEngine, nodeIdGenerator, implRegistry);
    }

    @Override
    public void setContentLevel(int level) {
        getRootNode().setContentLevel(level);
    }
}
