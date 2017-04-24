package ${targetPackage}.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.event.EventRegistryImpl;
import zhy2002.neutron.util.RandomUniqueIdGenerator;
import javax.validation.constraints.NotNull;
import dagger.Lazy;
import javax.inject.*;
import ${targetPackage}.gen.node.*;


@Singleton
public class ${typeName}Context extends AbstractUiNodeContext<${typeName}> {

    @Inject
    Lazy<${typeName}> rootNodeLazy;

    @Inject
    public ${typeName}Context(
        UiNodeChangeEngine changeEngine,
        UniqueIdGenerator nodeIdGenerator,
        @NotNull EventRegistryImpl implRegistry
    ) {
        super(
            RandomUniqueIdGenerator.Instance.next(),
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
