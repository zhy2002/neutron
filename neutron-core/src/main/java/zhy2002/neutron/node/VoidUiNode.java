package zhy2002.neutron.node;

import zhy2002.neutron.*;

import java.util.List;

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
            super(
                    null,
                    null,
                    null,
                    factoryRegistry
            );
        }

        @Override
        protected Class<VoidUiNode> getRootClass() {
            return VoidUiNode.class;
        }

        @Override
        protected VoidUiNode createRootNode() {
            throw new NotImplementedException();
        }


        @Override
        public NodeReferenceRegistry getNodeReferenceRegistry() {
            return null;
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
    public Class<?> getConcreteClass() {
        return VoidUiNode.class;
    }

    @Override
    protected void initializeState() {
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
    }

    @Override
    public boolean hasValue() {
        return false;
    }
}
