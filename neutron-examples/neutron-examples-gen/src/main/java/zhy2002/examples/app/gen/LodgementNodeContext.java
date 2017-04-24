package zhy2002.examples.app.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.event.EventRegistryImpl;
import zhy2002.neutron.util.RandomUniqueIdGenerator;
import javax.validation.constraints.NotNull;
import dagger.Lazy;
import javax.inject.*;
import zhy2002.examples.app.gen.node.*;


@Singleton
public class LodgementNodeContext extends AbstractUiNodeContext<LodgementNode> {

    @Inject
    Lazy<LodgementNode> rootNodeLazy;

    @Inject
    public LodgementNodeContext(
        UiNodeChangeEngine changeEngine,
        UniqueIdGenerator nodeIdGenerator,
        @NotNull EventRegistryImpl implRegistry
    ) {
        super(
            RandomUniqueIdGenerator.Instance.next(),
            changeEngine,
            nodeIdGenerator,
            new LodgementNodeClassRegistry(),
            implRegistry
        );
    }

    @Override
    protected Class<LodgementNode> getRootClass() {
        return LodgementNode.class;
    }

    @Override
    protected LodgementNode createRootNode() {
        return rootNodeLazy.get();
    }
}
