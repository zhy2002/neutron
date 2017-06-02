package ${targetPackage}.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.config.*;
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
    ContextConfigurer<${typeName}Context> configurer;

    @Inject
    public ${typeName}Context() {
        super();
    }

    @Override
    @NotNull
    protected ${typeName} createRootNode() {
        if (configurer != null) {
            configurer.configure(this);
            configurer = null;
        }
        return rootNodeLazy.get();
    }
}
