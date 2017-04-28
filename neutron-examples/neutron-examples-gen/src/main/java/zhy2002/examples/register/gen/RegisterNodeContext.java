package zhy2002.examples.register.gen;

import zhy2002.neutron.*;
import javax.validation.constraints.NotNull;
import dagger.Lazy;
import javax.inject.*;
import zhy2002.examples.register.gen.node.*;


@Singleton
public class RegisterNodeContext extends AbstractUiNodeContext<RegisterNode> {

    @Inject
    Lazy<RegisterNode> rootNodeLazy;

    @Inject
    public RegisterNodeContext() {
        super();
    }

    @Override
    @NotNull
    protected RegisterNode createRootNode() {
        return rootNodeLazy.get();
    }
}
