package zhy2002.neutron.next;

/**
 * The parent UiNode type for a root UiNode.
 * This class cannot be instantiated.
 */
public final class VoidUiNode extends ParentUiNode<VoidUiNode> {

    /**
     * A placeholder class needed to fulfill the contact that
     * the context super constructor parameter must not be null.
     */
    private final static class VoidUiNodeContext extends UiNodeContext {
    }

    /**
     * This constructor is provided to prevent this class from being instantiated.
     * IT SHOULD NEVER BE CALLED.
     */
    private VoidUiNode(){
        super(new VoidUiNodeContext());
    }
}
