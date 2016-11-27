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
    private final static class VoidUiNodeContext extends UiNodeContextImpl<VoidUiNode> {
        private VoidUiNodeContext(FactoryRegistry factoryRegistry) {
            super(factoryRegistry);
        }

        @Override
        protected VoidUiNode createRootNode() {
            throw new NotImplementedException();
        }

        @Override
        public <T> StateChangeEvent<T> createStateChangeEvent(UiNode<?> target, String key, Class<? super T> valueClass, T oldValue, T newValue) {
            throw new NotImplementedException();
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
