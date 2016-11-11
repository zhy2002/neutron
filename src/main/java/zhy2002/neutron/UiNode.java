package zhy2002.neutron;

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
     * The name of this node. Name is immutable and it uniquely identify a node in parent.
     */
    private final String name;
    /**
     * The context instance shared by the whole UiNode tree.
     */
    private final UiNodeContext context;
    /**
     * A map used to store current values of state properties.
     */
    private final Map<String, ? super Object> state = new HashMap<>();
    /**
     * The unique id of this node.
     */
    private final String uniqueId;

    /**
     * The path to this node.
     private String path;*/

    /**
     * The constructor for a child node.
     *
     * @param parent the parent node.
     * @param name
     */
    protected UiNode(@NotNull P parent, @NotNull String name) {
        assert parent.getChildren(name) == null;

        this.parent = parent;
        this.name = name;
        this.context = parent.getContext();
        this.uniqueId = context.getUniqueId();
    }

    /**
     * The constructor used for a root node.
     *
     * @param context the context instance.
     * @param name
     */
    protected UiNode(@NotNull UiNodeContext context) {
        assert context.getRoot() == null;

        this.parent = null;
        this.name = "";
        this.context = context;
        this.uniqueId = context.getUniqueId();
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

    public String getUniqueId() {
        return uniqueId;
    }

    public int getIndex() {
        if (parent != null) {
            return parent.indexOf(this);
        }
        return -1;
    }

    public String getName() {
        return name;
    }


}
