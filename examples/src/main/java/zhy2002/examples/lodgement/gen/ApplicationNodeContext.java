package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;
import javax.validation.constraints.NotNull;

public class ApplicationNodeContext extends AbstractUiNodeContext<ApplicationNode> {

    public ApplicationNodeContext(@NotNull ClassRegistryImpl implRegistry) {
        super(new ApplicationNodeClassRegistry(), implRegistry);
    }

    @Override
    protected Class<ApplicationNode> getRootClass() {
        return ApplicationNode.class;
        }

        protected ApplicationNode createRootNode() {
        return new ApplicationNode(this);
        }
}
