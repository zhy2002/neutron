package zhy2002.examples.app.gen;

import zhy2002.neutron.*;
import javax.validation.constraints.NotNull;
import dagger.Lazy;
import javax.inject.*;
import zhy2002.examples.app.gen.node.*;


@Singleton
public class LodgementNodeContext extends AbstractUiNodeContext<LodgementNode> {

    @Inject
    Lazy<LodgementNode> rootNodeLazy;

    @Inject
    public LodgementNodeContext() {
        super();
    }

    @Override
    @NotNull
    protected LodgementNode createRootNode() {
        return rootNodeLazy.get();
    }
}
