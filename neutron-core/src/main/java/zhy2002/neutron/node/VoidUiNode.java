package zhy2002.neutron.node;

import zhy2002.neutron.*;

import java.util.List;

/**
 * The parent UiNode type for a root UiNode.
 * This class cannot be instantiated.
 */
public final class VoidUiNode extends ParentUiNode<VoidUiNode> {

    /**
     * This constructor is provided to prevent this class from being instantiated.
     * IT SHOULD NEVER BE CALLED.
     */
    private VoidUiNode() {
        super(new VoidDummyUiNodeContext(new ClassRegistryImpl()));
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

    private static final class VoidDummyRootUiNode extends RootUiNode<VoidUiNode> {

        private VoidDummyRootUiNode(UiNodeContext<?> context) {
            super(context);
        }

        @Override
        public Class<?> getConcreteClass() {
            return VoidDummyRootUiNode.class;
        }

        @Override
        protected void initializeState() {

        }

        @Override
        protected void createRules(List<UiNodeRule<?>> createdRules) {

        }
    }

    /**
     * A placeholder class needed to fulfill the contact that
     * the context super constructor parameter must not be null.
     */
    private static final class VoidDummyUiNodeContext extends AbstractUiNodeContext<VoidDummyRootUiNode> {

        VoidDummyUiNodeContext(ClassRegistryImpl factoryRegistry) {
            super(
                    null,
                    null,
                    null,
                    factoryRegistry
            );
        }

        @Override
        protected Class<VoidDummyRootUiNode> getRootClass() {
            return VoidDummyRootUiNode.class;
        }

        @Override
        protected VoidDummyRootUiNode createRootNode() {
            throw new NotImplementedException();
        }

        @Override
        public NodeReferenceRegistry getNodeReferenceRegistry() {
            return null;
        }
    }
}

