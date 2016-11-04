package zhy2002.neutron.next;

import javax.validation.constraints.NotNull;
import java.util.HashMap;
import java.util.Map;

/**
 * Base class for all ui nodes.
 */
public abstract class UiNode<P extends ParentUiNode<?>> {

    /**
     * The parent ui node.
     */
    private final P parent;
    /**
     * The context instance shared by the whole UiNode tree.
     */
    private final UiNodeContext context;
    /**
     * A map used to store current values of state properties.
     */
    private final Map<String, ? super Object> state = new HashMap<>();

    /**
     * The constructor for a child node.
     *
     * @param parent the parent node.
     */
    protected UiNode(@NotNull P parent) {
        this.parent = parent;
        this.context = parent.getContext();
    }

    /**
     * The constructor used for a root node.
     *
     * @param context the context instance.
     */
    protected UiNode(@NotNull UiNodeContext context) {
        this.parent = null;
        this.context = context;
    }

    public
    @NotNull
    P getParent() {
        return parent;
    }

    public
    @NotNull
    UiNodeContext getContext() {
        return context;
    }

    protected <T> T getStateValueInternal(String key) {
        return (T) state.get(key);
    }

    protected void setStateValueInternal(String key, Object value) {
        state.put(key, value);
    }
}
