package zhy2002.neutron;

import java.util.Collection;

public class RuleEventBinding implements EventBinding {

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
}
