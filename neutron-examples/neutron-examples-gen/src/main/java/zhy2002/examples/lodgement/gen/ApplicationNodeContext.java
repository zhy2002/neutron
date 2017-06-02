package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.config.*;
import javax.validation.constraints.NotNull;
import dagger.Lazy;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import java.util.*;


@Singleton
public class ApplicationNodeContext extends AbstractUiNodeContext<ApplicationNode> {

    @Inject
    Lazy<ApplicationNode> rootNodeLazy;

    @Inject
    ContextConfigurer<ApplicationNodeContext> configurer;

    @Inject
    public ApplicationNodeContext() {
        super();
    }

    @Override
    @NotNull
    protected ApplicationNode createRootNode() {
        if (configurer != null) {
            configurer.configure(this);
            configurer = null;
        }
        return rootNodeLazy.get();
    }
}
