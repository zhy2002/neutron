package zhy2002.neutron.node;

import zhy2002.neutron.FactoryRegistry;
import zhy2002.neutron.ImmutableFactoryRegistry;
import zhy2002.neutron.UiNodeContext;

/**
 * The parent UiNode type for a root UiNode.
 * This class cannot be instantiated.
 */
public final class VoidUiNode extends ParentUiNode<VoidUiNode> {

    /**
     * A placeholder class needed to fulfill the contact that
     * the context super constructor parameter must not be null.
     */
    private final static class VoidUiNodeContext extends UiNodeContext<VoidUiNode> {
        private VoidUiNodeContext(FactoryRegistry factoryRegistry) {
            super(factoryRegistry);
        }

        @Override
        protected VoidUiNode createRootNode() {
            return new VoidUiNode();
        }
    }

    /**
     * This constructor is provided to prevent this class from being instantiated.
     * IT SHOULD NEVER BE CALLED.
     */
    private VoidUiNode() {
        super(new VoidUiNodeContext(new ImmutableFactoryRegistry()));
    }


    @Override
    protected void initializeSelf() {
    }

    @Override
    protected void initializeChildren() {

    }

    @Override
    protected void undoInitializeSelf() {

    }

    @Override
    protected void undoInitializeChildren() {

    }
}
