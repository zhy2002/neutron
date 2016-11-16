package zhy2002.neutron;

/**
 * The life cycle states of a node.
 */
public enum NodeLifeStateEnum {
    /**
     * Node is created but not added to the node tree.
     */
    Detached,
    /**
     * Node is added to the node tree but its content has not been loaded.
     */
    Unload,
    /**
     * Node is fully functional.
     */
    Loaded
}
