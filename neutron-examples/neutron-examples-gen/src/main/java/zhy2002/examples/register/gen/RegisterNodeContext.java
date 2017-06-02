package zhy2002.examples.register.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.config.*;
import javax.validation.constraints.NotNull;
import dagger.Lazy;
import javax.inject.*;
import zhy2002.examples.register.gen.node.*;
import java.util.*;


@Singleton
public class RegisterNodeContext extends AbstractUiNodeContext<RegisterNode> {

    @Inject
    Lazy<RegisterNode> rootNodeLazy;

    @Inject
    ContextConfigurer<RegisterNodeContext> configurer;

    @Inject
    public RegisterNodeContext() {
        super();
    }

    @Override
    @NotNull
    protected RegisterNode createRootNode() {
        if (configurer != null) {
            configurer.configure(this);
            configurer = null;
        }
        return rootNodeLazy.get();
    }
}
