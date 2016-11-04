package zhy2002.neutron.uinode;

import java.util.ArrayList;
import java.util.List;

/**
 * Base class for all list ui nodes.
 *
 * @param <P> Parent node type.
 * @param <T> list item node type.
 */
public abstract class ListUiNode<P extends ParentUiNode<?>, T extends UiNode<?>> extends ParentUiNode<P> {

    private final List<T> items = new ArrayList<>();

    protected ListUiNode(P parent) {
        super(parent);
    }

    protected ListUiNode(UiNodeContext context) {
        super(context);
    }
}
