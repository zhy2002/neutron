package zhy2002.examples.register;

import zhy2002.neutron.*;

/**
 * Context and Root are a pair. This whole class is generated.
 */
public class RegisterNodeContextAbstract extends AbstractUiNodeContext<RegisterNode> {

    public RegisterNodeContextAbstract(ClassRegistryImpl classRegistry) {
        super(classRegistry);
    }

    //endregion

    protected RegisterNode createRootNode() {
        return new RegisterNode(this);
    }



}
