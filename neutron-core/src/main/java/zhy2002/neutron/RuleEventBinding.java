package zhy2002.neutron;

/**
 * Instances of this class wrap EventBindings created by a rule
 * so that at runtime we can know which rule created the event bindings.
 */
public class RuleEventBinding implements EventBinding {

    /**
     * The rule that owns this event binding.
     */
    private final UiNodeRule<?> rule;
    private final EventBinding target;

    public RuleEventBinding(UiNodeRule<?> rule, EventBinding binding) {
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
