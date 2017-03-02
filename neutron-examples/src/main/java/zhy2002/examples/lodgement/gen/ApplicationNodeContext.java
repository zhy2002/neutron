package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.util.RandomUniqueIdGenerator;
import javax.validation.constraints.NotNull;
import dagger.Lazy;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;


@Singleton
public class ApplicationNodeContext extends AbstractUiNodeContext<ApplicationNode> {

    @Inject
    Lazy<ApplicationNode> rootNodeLazy;

    @Inject
    public ApplicationNodeContext(
        UiNodeChangeEngine changeEngine,
        UniqueIdGenerator nodeIdGenerator,
        @NotNull ClassRegistryImpl implRegistry
    ) {
        super(
            RandomUniqueIdGenerator.Instance.next(),
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