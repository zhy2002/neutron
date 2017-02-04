package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;
import javax.validation.constraints.NotNull;

public class ApplicationNodeContext extends AbstractUiNodeContext<ApplicationNode> {

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
        return new ApplicationNode(this);
    }
}
