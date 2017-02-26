package zhy2002.examples.app.gen;

import zhy2002.neutron.*;
import javax.validation.constraints.NotNull;
import dagger.Lazy;
import javax.inject.Inject;
import zhy2002.examples.app.gen.node.*;


public class LodgementNodeContext extends AbstractUiNodeContext<LodgementNode> {

    @Inject
    Lazy<LodgementNode> rootNodeLazy;

    public LodgementNodeContext(
        String contextId,
        UiNodeChangeEngine changeEngine,
        UniqueIdGenerator nodeIdGenerator,
        @NotNull ClassRegistryImpl implRegistry
    ) {
        super(
            contextId,
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
