package zhy2002.examples.register.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.util.RandomUniqueIdGenerator;
import javax.validation.constraints.NotNull;
import dagger.Lazy;
import javax.inject.*;
import zhy2002.examples.register.gen.node.*;


@Singleton
public class RegisterNodeContext extends AbstractUiNodeContext<RegisterNode> {

    @Inject
    Lazy<RegisterNode> rootNodeLazy;

    @Inject
    public RegisterNodeContext(
        UiNodeChangeEngine changeEngine,
        UniqueIdGenerator nodeIdGenerator,
        @NotNull ClassRegistryImpl implRegistry
    ) {
        super(
            RandomUniqueIdGenerator.Instance.next(),
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
        return rootNodeLazy.get();
    }
}
