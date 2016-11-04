package zhy2002.neutron.uinode;

/**
 * The base class for all ui nodes.
 */
public abstract class UiNode<P extends ParentUiNode> {

    private final P parent;
    private final UiNodeContext context;

    /**
     * Constructor for a child node.
     *
     * @param parent the parent node.
     */
    protected UiNode(P parent) {
        assert parent != null;

        this.parent = parent;
        this.context = parent.getContext();
    }

    /**
     * Constructor for a root node.
     * Each ui node tree must have a separate context instance.
     *
     * @param context the context for this ui node tree.
     */
    protected UiNode(UiNodeContext context) {
        assert context != null;

        this.parent = null;
        this.context = context;
    }

    public P getParent() {
        return parent;
    }

    public UiNodeContext getContext() {
        return context;
    }

}
