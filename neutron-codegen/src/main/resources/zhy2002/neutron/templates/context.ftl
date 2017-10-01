package ${targetPackage}.gen;
/* template name: context.ftl */
import zhy2002.neutron.core.*;
import zhy2002.neutron.core.config.*;
import javax.validation.constraints.NotNull;
import dagger.Lazy;
import javax.inject.*;
import ${targetPackage}.gen.node.*;
import java.util.*;


@Singleton
public class ${typeName}Context extends AbstractUiNodeContext<${typeName}> {

    @Inject
    Lazy<${typeName}> rootNodeLazy;

    @Inject
    Lazy<Set<ContextConfigurer<${typeName}Context>>> configurers;

    @Inject
    public ${typeName}Context() {
        super();
    }

    @Override
    @NotNull
    protected ${typeName} createRootNode() {
        if (configurers != null) {
            configurers.get().stream().sorted(Comparator.comparingInt(Ordered::getOrderKey)).forEach(c -> c.configure(this));
            configurers = null;
        }
        return rootNodeLazy.get();
    }
}
