package ${targetPackage}.gen;

import zhy2002.neutron.*;
import javax.validation.constraints.NotNull;

public class ${typeName}Context extends AbstractUiNodeContext<${typeName}> {

    public ${typeName}Context(@NotNull ClassRegistryImpl implRegistry) {
        super(new ${typeName}ClassRegistry(), implRegistry);
    }

    @Override
    protected Class<${typeName}> getRootClass() {
        return ${typeName}.class;
        }

        protected ${typeName} createRootNode() {
        return new ${typeName}(this);
        }
}
