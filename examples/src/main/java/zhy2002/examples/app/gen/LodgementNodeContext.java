package zhy2002.examples.app.gen;

import zhy2002.neutron.*;
import javax.validation.constraints.NotNull;

public class LodgementNodeContext extends AbstractUiNodeContext<LodgementNode> {

    public LodgementNodeContext(@NotNull ClassRegistryImpl implRegistry) {
        super(new LodgementNodeClassRegistry(), implRegistry);
    }

    @Override
    protected Class<LodgementNode> getRootClass() {
        return LodgementNode.class;
        }

        protected LodgementNode createRootNode() {
        return new LodgementNode(this);
        }
}
