package zhy2002.neutron;

/**
 * Instances of this interface are hooks into the node structure
 * which is fired when at the specified phase of interested events.
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
