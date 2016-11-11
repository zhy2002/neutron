package zhy2002.neutron.event;

/**
 * This event fires when a node is unload. All its children and its state will be destroyed by itself is kept to be loaded again.
 * Reset = unload + load.
 */
public class NodeUnloadEvent extends UiNodeEvent {
}
