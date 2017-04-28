package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;
import javax.validation.constraints.NotNull;
import dagger.Lazy;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;


@Singleton
public class ApplicationNodeContext extends AbstractUiNodeContext<ApplicationNode> {

    @Inject
    Lazy<ApplicationNode> rootNodeLazy;

    @Inject
    public ApplicationNodeContext() {
        super();
    }

    @Override
    @NotNull
    protected ApplicationNode createRootNode() {
        return rootNodeLazy.get();
    }
}
