package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;
import javax.validation.constraints.NotNull;
import dagger.Lazy;
import javax.inject.Inject;
import zhy2002.examples.lodgement.gen.node.*;


public class ApplicationNodeContext extends AbstractUiNodeContext<ApplicationNode> {

    @Inject
    Lazy<ApplicationNode> rootNodeLazy;

    public ApplicationNodeContext(
        String contextId,
        UiNodeChangeEngine changeEngine,
        UniqueIdGenerator nodeIdGenerator,
        @NotNull ClassRegistryImpl implRegistry
    ) {
        super(
            contextId,
            changeEngine,
            nodeIdGenerator,
            new ApplicationNodeClassRegistry(),
            implRegistry
        );
    }

    @Override
    protected Class<ApplicationNode> getRootClass() {
        return ApplicationNode.class;
    }

    @Override
    protected ApplicationNode createRootNode() {
        return rootNodeLazy.get();
    }
}
