package zhy2002.neutron;

import java.util.Collection;

/**
 * This class is created so that at runtime we cannot which rule created
 * the target event binding.
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
    public Collection<UiNodeEventKey<?>> getEventKeys() {
        return target.getEventKeys();
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
