package ${targetPackage}.gen;

import zhy2002.neutron.*;
import javax.validation.constraints.NotNull;
import dagger.Lazy;
import javax.inject.*;
import ${targetPackage}.gen.node.*;


@Singleton
public class ${typeName}Context extends AbstractUiNodeContext<${typeName}> {

    @Inject
    Lazy<${typeName}> rootNodeLazy;

    @Inject
    public ${typeName}Context() {
        super();
    }

    @Override
    @NotNull
    protected ${typeName} createRootNode() {
        return rootNodeLazy.get();
    }
}
