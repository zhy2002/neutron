package zhy2002.examples.app.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.config.*;
import javax.validation.constraints.NotNull;
import dagger.Lazy;
import javax.inject.*;
import zhy2002.examples.app.gen.node.*;
import java.util.*;


@Singleton
public class GlobalUiStateNodeContext extends AbstractUiNodeContext<GlobalUiStateNode> {

    @Inject
    Lazy<GlobalUiStateNode> rootNodeLazy;

    @Inject
    Lazy<Set<ContextConfigurer<GlobalUiStateNodeContext>>> configurers;

    @Inject
    public GlobalUiStateNodeContext() {
        super();
    }

    @Override
    @NotNull
    protected GlobalUiStateNode createRootNode() {
        if (configurers != null) {
            configurers.get().stream().sorted(Comparator.comparingInt(Ordered::getOrderKey)).forEach(c -> c.configure(this));
            configurers = null;
        }
        return rootNodeLazy.get();
    }
}
