package zhy2002.neutron;

/**
 * The base class for all UiNode events.
 * Subclasses are well-known, that is user should not inherit from this class.
 */
public abstract class UiNodeEvent {

    private final UiNode<?> target;
    private UiNodeRuleActivation activation;
    private String ruleGroup;

    protected UiNodeEvent(UiNode<?> target) {
        this.target = target;
        this.activation = target.getContext().getCurrentActivation();
        this.ruleGroup = PredefinedRuleGroups.DEFAULT;
    }

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

    protected void setRuleGroup(String ruleGroup) {
        this.ruleGroup = ruleGroup;
    }

    public String getRuleGroup() {
        return ruleGroup;
    }

    protected void setActivation(UiNodeRuleActivation activation) {
        this.activation = activation;
    }

    /**
     * Get all rule activations caused by this event.
     *
     * @return rule activations to be fired.
     */
    public abstract Iterable<UiNodeRuleActivation> getActivations();
}
