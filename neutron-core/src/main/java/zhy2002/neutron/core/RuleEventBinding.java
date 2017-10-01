package zhy2002.neutron.core;

/**
 * Wraps another event binding so that at runtime
 * we can know which rule created the event bindings.
 */
public final class RuleEventBinding implements EventBinding {

    /**
     * The rule that owns this event binding.
     */
    private final UiNodeRule<?> rule;
    /**
     * The wrapped event binding.
     */
    private final EventBinding target;

    RuleEventBinding(UiNodeRule<?> rule, EventBinding binding) {
        this.rule = rule;
        this.target = binding;
    }

    public UiNodeRule<?> getRule() {
        return rule;
    }

    @Override
    public UiNodeEventKey<?> getEventKey() {
        return target.getEventKey();
    }

    @Override
    public TickPhase getPhase() {
        return target.getPhase();
    }

    @Override
    public boolean canFire(UiNodeEvent event) {
        return target.canFire(event);
    }

    @Override
    public void fire(UiNodeEvent event) {
        target.fire(event);
    }

    @Override
    public String toString() {
        return target + " by " + rule.getClass().getSimpleName();
    }
}
