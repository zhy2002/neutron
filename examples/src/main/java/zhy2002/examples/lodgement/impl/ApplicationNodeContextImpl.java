package zhy2002.examples.lodgement.impl;

import zhy2002.examples.lodgement.gen.ApplicationNode;
import zhy2002.examples.lodgement.gen.ApplicationNodeContext;
import zhy2002.neutron.ClassRegistryImpl;

import javax.validation.constraints.NotNull;

/**
 * Additional methods for JSX.
 */
public class ApplicationNodeContextImpl extends ApplicationNodeContext {

    public ApplicationNodeContextImpl(@NotNull ClassRegistryImpl implRegistry) {
        super(implRegistry);
    }

    @Override
    protected ApplicationNode createRootNode() {
        return new ApplicationNodeImpl(this);
    }
}