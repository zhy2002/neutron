package zhy2002.neutron;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Immutable data class that encapsulates all the objects
 * needed to fire a rule.
 */
public final class BindingActivation {

    private static Logger logger = Logger.getLogger("BindingActivation");

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
        UiNodeRule<?> rule = getRule();
        if (rule != null) {
            logger.log(Level.INFO, "Firing rule " + rule.getClass().getSimpleName() + " with event " + getEvent() + " from " + getEvent().getOrigin().getClass().getSimpleName());
        }

        binding.fire(event);
    }
}
