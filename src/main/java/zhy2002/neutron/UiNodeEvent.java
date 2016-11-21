package zhy2002.neutron;

/**
 * The base class for all UiNode events.
 */
public abstract class UiNodeEvent {

    private final UiNode<?> target;
    private final UiNodeRuleActivation activation;

    protected UiNodeEvent(UiNode<?> target, UiNodeRuleActivation activation) {
        this.target = target;
        this.activation = activation;
    }

    /**
     * @return a enum value that represents the type of a ui node event.
     */
    public abstract UiNodeEventTypeEnum getEventType();

    /**
     * @return The ui node where the event (e.g. state change, add child or remove child) occurred.
     */
    public UiNode<?> getTarget() {
        return target;
    }

    /**
     * @return the activation object where this event is raised (meaning this event was created during executing the activation).
     * Null if this is a root (raised by external api) event.
     */
    public UiNodeRuleActivation getActivation() {
        return activation;
    }
}
