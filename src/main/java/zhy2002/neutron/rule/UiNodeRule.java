package zhy2002.neutron.rule;

import zhy2002.neutron.EventTypeEnum;
import zhy2002.neutron.event.TickPhase;
import zhy2002.neutron.event.UiNodeEvent;
import zhy2002.neutron.node.UiNode;

/**
 * Base class for a ui node rule.
 */
public abstract class UiNodeRule<E extends UiNodeEvent, N extends UiNode<?>> {

    /**
     * The owner UiNode of this rule.
     */
    private final N owner;
    /**
     * The phase when the rule should fire.
     */
    private final TickPhase phase;
    /**
     * Host is an ancestor of owner (can be owner itself).
     * This rule is notified when an event is passed to the host node.
     */
    private UiNode<?> host;

    protected UiNodeRule(N owner, TickPhase phase) {
        this.owner = owner;
        this.phase = phase;
    }

    public N getOwner() {
        return owner;
    }

    public UiNode<?> getHost() {
        return host;
    }

    public TickPhase getPhase() {
        return phase;
    }

    /**
     * Fired once when the rule is added to owner.
     *
     * @return the host node which does not change during the life time of a rule instance.
     */
    protected UiNode<?> findHost() {
        return owner; //host is defaulted to owner.
    }

    /**
     * Determines if UiNodeEvent originated form the node passed in should trigger this rule.
     *
     * @param eventTarget a UiNode that has just changed.
     * @return true if the rule should fire.
     */
    public boolean isObservedUiNode(UiNode<?> eventTarget) {
        return eventTarget == host;
    }

    /**
     * The main logic of this rule. This method is called if:
     * event is an instance of E
     * the phase is phase
     * isTarget(event.getOriginator()) returns true
     *
     * @param event the change event happened.
     */
    @SuppressWarnings("unchecked")
    public void fire(UiNodeEvent event) {
        execute((E) event);
    }

    protected abstract void execute(E typedEvent);

    public abstract EventTypeEnum getEventType();

    /**
     * The final step to add a rule to a node.
     */
    public void addToOwner() {
        this.host = findHost();
        getOwner().addRule(this);
        getHost().attachRule(this);
    }

    /**
     * Removes this rule from the owner.
     * This must be called when owner or its ancestor is unloaded.
     */
    public void removeFromOwner() {
        getHost().detachRule(this);
        getOwner().removeRule(this);
        this.host = null;
    }

}
