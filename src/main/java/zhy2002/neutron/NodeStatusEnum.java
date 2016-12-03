package zhy2002.neutron;

/**
 * The life cycle states of a node.
 */
public enum NodeStatusEnum {
    /**
     * Node is created but not added to the node tree.
     */
    Detached,
    /**
     * Node is added to the node tree but its content has not been loaded.
     */
    Unloaded,
    /**
     * Node is fully functional.
     */
    Loaded
}
