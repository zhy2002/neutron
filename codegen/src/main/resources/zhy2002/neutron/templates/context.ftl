package ${targetPackage}.gen;

import zhy2002.neutron.*;
import javax.validation.constraints.NotNull;

public class ${typeName}Context extends AbstractUiNodeContext<${typeName}> {

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
            new ${typeName}ClassRegistry(),
            implRegistry
        );
    }

    @Override
    protected Class<${typeName}> getRootClass() {
        return ${typeName}.class;
        }

    @Override
    protected ${typeName} createRootNode() {
        return new ${typeName}(this);
    }
}
