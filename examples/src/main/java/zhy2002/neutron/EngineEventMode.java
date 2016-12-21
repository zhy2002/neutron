package zhy2002.neutron;

/**
 * Decides when then engine process event.
 */
public enum EngineEventMode {
    /**
     * Event will be parsed and all activations will be added to the agenda.
     */
    Send,
    /**
     * Event is queued and will be picked up in next tick.
     */
    Post
}
