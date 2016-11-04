package zhy2002.neutron.uinode;

import java.io.Serializable;

/**
 * Base class for ui nodes that cannot contain children.
 */
public abstract class LeafUiNode<P extends ParentUiNode<?>, V extends Serializable> extends UiNode<P> {

    public V getValue() {
        throw new RuntimeException("not implemented");
    }

    public void setValue(V value) {
        throw new RuntimeException("not implemented");
    }

    protected LeafUiNode(P parent) {
        super(parent);
    }

    protected LeafUiNode(UiNodeContext context) {
        super(context);
    }

}
