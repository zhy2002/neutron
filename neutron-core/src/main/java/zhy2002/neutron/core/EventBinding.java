package zhy2002.neutron.core;

/**
 * A hook into the node structure to receive events.
 * When a matching event is received, then canFire will be called
 * in the specified phase to determine if fire should be called.
 */
public interface EventBinding {

    UiNodeEventKey<?> getEventKey();

    TickPhase getPhase();

    /**
     * Test if this binding can be added to the activation list.
     * This is called when the event is processed.
     *
     * @param event the event that matches this binding by event key.
     * @return true if this binding will fire.
     */
    boolean canFire(UiNodeEvent event);

    void fire(UiNodeEvent event);
}
