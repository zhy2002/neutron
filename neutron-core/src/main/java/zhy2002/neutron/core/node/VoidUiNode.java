package zhy2002.neutron.core.node;

import zhy2002.neutron.core.*;
import zhy2002.neutron.core.exception.NotImplementedException;

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
        super(new VoidDummyUiNodeContext());
    }

    @Override
    public Class<?> getConcreteClass() {
        return VoidUiNode.class;
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
    }

    @Override
    public boolean hasValue() {
        return false;
    }

    @Override
    public void resetValue() {
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
        protected void createRules(List<UiNodeRule<?>> createdRules) {

        }
    }

    /**
     * A placeholder class needed to fulfill the contact that
     * the context super constructor parameter must not be null.
     */
    private static final class VoidDummyUiNodeContext extends AbstractUiNodeContext<VoidDummyRootUiNode> {

        VoidDummyUiNodeContext() {
            super();
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

