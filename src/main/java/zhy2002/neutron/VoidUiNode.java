package zhy2002.neutron;

/**
 * The parent UiNode type for a root UiNode.
 * This class cannot be instantiated.
 */
public final class VoidUiNode extends ParentUiNode<VoidUiNode> {

    /**
     * A placeholder class needed to fulfill the contact that
     * the context super constructor parameter must not be null.
     */
    private final static class VoidAbstractUiNodeContext extends AbstractUiNodeContext<VoidUiNode> {
        private VoidAbstractUiNodeContext(ClassRegistryImpl factoryRegistry) {
            super(factoryRegistry);
        }

        @Override
        protected Class<VoidUiNode> getRootClass() {
            return VoidUiNode.class;
        }

        @Override
        protected VoidUiNode createRootNode() {
            throw new NotImplementedException();
        }
    }

    /**
     * This constructor is provided to prevent this class from being instantiated.
     * IT SHOULD NEVER BE CALLED.
     */
    private VoidUiNode() {
        super(new VoidAbstractUiNodeContext(new ClassRegistryImpl()));
    }


    @Override
    protected void initializeChildren() {
    }

    @Override
    protected void uninitializeChildren() {
    }
}
