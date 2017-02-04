package zhy2002.examples.register.gen;

import zhy2002.neutron.*;
import javax.validation.constraints.NotNull;

public class RegisterNodeContext extends AbstractUiNodeContext<RegisterNode> {

    public RegisterNodeContext(
        String contextId,
        UiNodeChangeEngine changeEngine,
        UniqueIdGenerator nodeIdGenerator,
        @NotNull ClassRegistryImpl implRegistry
    ) {
        super(
            contextId,
            changeEngine,
            nodeIdGenerator,
            new RegisterNodeClassRegistry(),
            implRegistry
        );
    }

    @Override
    protected Class<RegisterNode> getRootClass() {
        return RegisterNode.class;
        }

    @Override
    protected RegisterNode createRootNode() {
        return new RegisterNode(this);
    }
}
