package zhy2002.neutron;

import zhy2002.neutron.util.PredefinedRuleGroups;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


/**
 * A UiNodeRule is a unit of business logic that is embedded into the node context
 * and is executed when the events it is interested in occur.
 *
 * @param <N> the type of owner node.
 */
public abstract class UiNodeRule<N extends UiNode<?>> {

    private final N owner;
    private UiNode<?> host;
    private Collection<EventBinding> eventBindings;
    private Collection<String> ruleGroups;


    protected UiNodeRule(N owner) {
        this.owner = owner;
    }

    /**
     * @return The owner UiNode of this rule.
     * The rule instance's life cycle is bound to its owner.
     */
    public final N getOwner() {
        return owner;
    }

    protected final UiNodeContext<?> getContext() {
        return getOwner().getContext();
    }

    /**
     * Host is the node this rule is attached to; usually is the owner or ancestor of owner.
     * Events passing the host node will have a chance to activate the rules attached to the host node.
     */
    public final UiNode<?> getHost() {
        return host;
    }

    /**
     * This method is called once when the owner is being loaded.
     * This means the host node does not change while the owner is in loaded state.
     * The host node defaults to the owner node.
     *
     * @return the host node.
     */
    protected UiNode<?> findHost() {
        return owner;
    }

    /**
     * Event binding is the hook into the node context and receiver of events.
     * Technically rules do not know when events occur. It is the job of AbstractEventBinding
     * to let rules know an interesting event has occurred.
     */
    public final Collection<EventBinding> getEventBindings() {
        return eventBindings;
    }

    /**
     * Create all the event bindings of this node the first time it is added to owner.
     *
     * @return immutable collection of event bindings.
     */
    protected abstract Collection<EventBinding> createEventBindings();

    /**
     * Get the rule groups this node belongs to.
     * A rule can only be activated if the event is
     * in one of these groups.
     * This collection is immutable.
     */
    public final Collection<String> getRuleGroups() {
        if (ruleGroups == null) {
            ruleGroups = Collections.unmodifiableCollection(getDefaultRuleGroups());
        }
        return ruleGroups;
    }

    public final void setRuleGroups(Collection<String> ruleGroups) {
        if (ruleGroups == null) {
            this.ruleGroups = null;
        } else {
            this.ruleGroups = Collections.unmodifiableCollection(new ArrayList<>(ruleGroups));
        }
    }

    protected Collection<String> getDefaultRuleGroups() {
        return Collections.singletonList(PredefinedRuleGroups.DEFAULT);
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
        if(getOwner().getNodeStatus() == NodeStatusEnum.Detached) {
            getOwner().addCreatedRule(this);
            return;
        }

        this.host = findHost();
        getOwner().addRule(this);
        if (eventBindings == null) {
            Collection<EventBinding> eventBindings = new ArrayList<>();
            for (EventBinding eventBinding : createEventBindings()) {
                eventBindings.add(new RuleEventBinding(this, eventBinding));
            }
            this.eventBindings = eventBindings;
        }
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

    protected void onLoad() {}

    protected void onUnload() {}
}

