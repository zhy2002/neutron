package zhy2002.neutron.rule;

import zhy2002.neutron.TickPhase;
import zhy2002.neutron.UiNode;
import zhy2002.neutron.UiNodeEvent;
import zhy2002.neutron.util.EnhancedLinkedList;


/**
 * A UI node rule a piece of logic that runs when an event happens.
 * @param <E> the base event type this rule handles.
 * @param <N> the type of owner node.
 */
public abstract class UiNodeRule<E extends UiNodeEvent, N extends UiNode<?>> {

    /**
     * The owner UiNode of this rule.
     * The rule instance's life cycle is bound to its owner.
     */
    private final N owner;
    /**
     * Host is self or ancestor of owner.
     * This rule has a chance to fire when an event passes through the host node.
     */
    private UiNode<?> host;
    /**
     * The phase when the rule should fire.
     */
    private final TickPhase phase;

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
     * The types of events that can trigger this rule.
     * This method is only called once when owner is being loaded.
     * @return a list of event classes.
     */
    public EnhancedLinkedList<Class<? extends E>> observedEventTypes() {
        return new EnhancedLinkedList<>();
    }

    /**
     * This method is called once when the owner is being loaded.
     * This means the host node does not change while the owner is in loaded state.
     * The host node defaults to the owner node.
     * @return the host node.
     */
    protected UiNode<?> findHost() {
        return owner;
    }

    /**
     * The second step of add a rule to the owner.
     * In Neutron when we setup a bidirectional relationship,
     * we use a two step approach:
     * 1. Child is create knowing the parent
     * 2. Child make itself known to the parent
     * If step 2 is not done, there is no effect to the node tree
     * where the parent belongs.
     * The same convention applies to node parent child relationship as well.
     */
    public void addToOwner() {
        this.host = findHost();
        getOwner().addRule(this);
        getHost().attachRule(this);
    }

    /**
     * Removes this rule from the owner.
     */
    public void removeFromOwner() {
        getHost().detachRule(this);
        getOwner().removeRule(this);
        this.host = null;
    }

    /**
     * When a event is passed to this rule, this method is called
     * to determine if the rule should fire.
     * @param event the event for which this rule is triggered.
     * @return true if this rule should fire.
     * The same event instance will be passed to the fire method.
     */
    public boolean canFire(UiNodeEvent event) {
        return event.getTarget() == getHost();
    }

    /**
     * Called when the rule fires.
     * @param event the event instance.
     */
    @SuppressWarnings("unchecked")
    public final void fire(UiNodeEvent event) {
        doFire((E) event);

    }

    /**
     * Contains the main logic of this rule.
     * @param typedEvent strongly typed event instance.
     */
    protected abstract void doFire(E typedEvent);

}
