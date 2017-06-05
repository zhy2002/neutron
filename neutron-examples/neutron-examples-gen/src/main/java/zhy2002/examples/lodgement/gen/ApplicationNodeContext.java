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
    Lazy<Set<ContextConfigurer<ApplicationNodeContext>>> configurers;

    @Inject
    public ApplicationNodeContext() {
        super();
    }

    @Override
    @NotNull
    protected ApplicationNode createRootNode() {
        if (configurers != null) {
            configurers.get().stream().sorted(Comparator.comparingInt(Ordered::getOrderKey)).forEach(c -> c.configure(this));
            configurers = null;
        }
        return rootNodeLazy.get();
    }
}
