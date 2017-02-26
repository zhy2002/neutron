package ${targetPackage}.gen;

import zhy2002.neutron.*;
import javax.validation.constraints.NotNull;
import dagger.Lazy;
import javax.inject.Inject;
import ${targetPackage}.gen.node.*;


public class ${typeName}Context extends AbstractUiNodeContext<${typeName}> {

    @Inject
    Lazy<${typeName}> rootNodeLazy;

    public ${typeName}Context(
        String contextId,
        UiNodeChangeEngine changeEngine,
        UniqueIdGenerator nodeIdGenerator,
        @NotNull ClassRegistryImpl implRegistry
    ) {
        super(
            contextId,
            changeEngine,
            nodeIdGenerator,
            new ${contextName}ClassRegistry(),
            implRegistry
        );
    }

    @Override
    protected Class<${typeName}> getRootClass() {
        return ${typeName}.class;
    }

    @Override
    protected ${typeName} createRootNode() {
        return rootNodeLazy.get();
    }
}
