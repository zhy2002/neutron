package zhy2002.neutron;

import zhy2002.neutron.util.NeutronConstants;

import javax.validation.constraints.NotNull;

/**
 * The base class for all UiNode events.
 * Subclasses are well-known, that is user should not inherit from this class.
 */
public abstract class UiNodeEvent {

    /**
     * The node that raised this event.
     * E.g. the node whose state is changed or
     * the node being added to or removed from the context.
     */
    private final UiNode<?> origin;
    /**
     * A string tha describes what this event is about.
     */
    private final String subject;
    /**
     * Only activate rules in this rule group.
     */
    private String ruleGroup;
    /**
     * The activation object during the execution of which
     * this event is raised (that is this event was created during executing the activation).
     * Null if this is a root (raised by external api) event.
     */
    private BindingActivation activation;
    /**
     * Cache the event key.
     */
    private UiNodeEventKey<?> eventKey;

    /**
     * Data associated with this event.
     * <p>
     * private final Map<String, Object> tags = new HashMap<>();
     */

    protected UiNodeEvent(@NotNull UiNode<?> origin, @NotNull String subject) {
        this.origin = origin;
        this.subject = subject;
        this.activation = origin.getContext().getCurrentActivation();
        setRuleGroup(null);
    }

    final UiNodeEventKey<?> getEventKey() {
        if (eventKey == null) {
            eventKey = new UiNodeEventKey<>(this.getClass(), this.getSubject());
        }
        return eventKey;
    }

    public UiNode<?> getOrigin() {
        return origin;
    }

    public final String getSubject() {
        return subject;
    }

    public final String getRuleGroup() {
        return ruleGroup;
    }

    public final void setRuleGroup(String ruleGroup) {
        if (ruleGroup == null) {
            ruleGroup = NeutronConstants.DEFAULT_RULE_GROUP;
        }
        this.ruleGroup = ruleGroup;
    }

    public BindingActivation getActivation() {
        return activation;
    }

    protected void setActivation(BindingActivation activation) {
        this.activation = activation;
    }

    /**
     * Get all rule activations caused by this event.
     *
     * @return rule activations to be fired.
     */
    public abstract Iterable<BindingActivation> getActivations();

    @Override
    public String toString() {
        return getClass().getSimpleName() + ":" + getSubject();
    }
}
