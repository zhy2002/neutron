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
    Lazy<Set<ContextConfigurer<RegisterNodeContext>>> configurers;

    @Inject
    public RegisterNodeContext() {
        super();
    }

    @Override
    @NotNull
    protected RegisterNode createRootNode() {
        if (configurers != null) {
            configurers.get().stream().sorted(Comparator.comparingInt(Ordered::getOrderKey)).forEach(c -> c.configure(this));
            configurers = null;
        }
        return rootNodeLazy.get();
    }
}
