package zhy2002.examples.register.gen;

import zhy2002.neutron.*;
import javax.validation.constraints.NotNull;

public class RegisterNodeContext extends AbstractUiNodeContext<RegisterNode> {

    public RegisterNodeContext(@NotNull ClassRegistryImpl implRegistry) {
        super(new RegisterNodeClassRegistry(), implRegistry);
    }

    @Override
    protected Class<RegisterNode> getRootClass() {
        return RegisterNode.class;
        }

        protected RegisterNode createRootNode() {
        return new RegisterNode(this);
        }
}
