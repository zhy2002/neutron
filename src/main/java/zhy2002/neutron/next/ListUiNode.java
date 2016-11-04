package zhy2002.neutron.next;

import javax.validation.constraints.NotNull;

/**
 * A ParentUiNode whose children are put in a list.
 */
public class ListUiNode<P extends ObjectUiNode<?>> extends ParentUiNode<P> {

    /**
     * A the type constraint indicates, a ListUiNode's parent
     * must be an ObjectUiNode.
     * @param parent the parent ObjectUiNode.
     */
    protected ListUiNode(@NotNull P parent) {
        super(parent);
    }
}
