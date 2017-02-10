package zhy2002.examples.lodgement.impl;

import zhy2002.examples.lodgement.gen.ApplicationNodeContext;
import zhy2002.neutron.ClassRegistryImpl;
import zhy2002.neutron.UiNodeChangeEngine;
import zhy2002.neutron.UniqueIdGenerator;
import zhy2002.neutron.util.RandomUniqueIdGenerator;

import javax.inject.Inject;
import javax.validation.constraints.NotNull;

/**
 * Additional methods for JSX.
 */
public class ApplicationNodeContextImpl extends ApplicationNodeContext {

    @Inject
    public ApplicationNodeContextImpl(
            UiNodeChangeEngine changeEngine,
            UniqueIdGenerator nodeIdGenerator,
            @NotNull ClassRegistryImpl implRegistry
    ) {
        super(
                RandomUniqueIdGenerator.Instance.next(),
                changeEngine,
                nodeIdGenerator,
                implRegistry
        );
    }

}
