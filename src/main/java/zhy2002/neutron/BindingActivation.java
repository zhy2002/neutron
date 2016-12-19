package zhy2002.neutron;

/**
 * Immutable data class that encapsulates all the objects
 * needed to fire a rule.
 */
public final class BindingActivation {

    private final EventBinding binding;
    private final UiNodeEvent event;

    public BindingActivation(EventBinding binding, UiNodeEvent event) {
        this.binding = binding;
        this.event = event;
    }

    public TickPhase getPhase() {
        return binding.getPhase();
    }

    public UiNodeEvent getEvent() {
        return event;
    }

    public UiNodeRule<?> getRule() {
        if (binding instanceof RuleEventBinding) {
            return ((RuleEventBinding) binding).getRule();
        }
        return null;
    }

    void fire() {
        binding.fire(event);
    }
}
