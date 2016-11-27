package zhy2002.neutron;

/**
 * The base class for all UiNode events.
 * Subclasses are well-known, that is user should not inherit from this class.
 */
public abstract class UiNodeEvent {

    private final UiNode<?> target;
    private final UiNodeRuleActivation activation;
    private final String ruleGroup;

    protected UiNodeEvent(UiNode<?> target) {
        this(target, target.getContext().getCurrentActivation(), PredefinedRuleGroups.DEFAULT); //"" is the default ruleGroup
    }

    protected UiNodeEvent(UiNode<?> target, UiNodeRuleActivation activation, String ruleGroup) {
        this.target = target;
        this.activation = activation;
        this.ruleGroup = ruleGroup;
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

    public String getRuleGroup() {
        return ruleGroup;
    }
}
