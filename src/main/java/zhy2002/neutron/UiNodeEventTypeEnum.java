package zhy2002.neutron;

/**
 * Event type supported by the framework.
 */
public enum UiNodeEventTypeEnum {
    /**
     * When the state of a UiNode is changed.
     */
    StateChange,
    /**
     * When adding a child to a ListUiNode.
     */
    NodeAdd,
    /**
     * When removing a child from a ListUiNode.
     */
    NodeRemove
}
