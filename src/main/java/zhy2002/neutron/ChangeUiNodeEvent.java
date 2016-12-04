package zhy2002.neutron;

import java.util.ArrayList;
import java.util.List;

/**
 * Change event.
 */
public abstract class ChangeUiNodeEvent extends UiNodeEvent {

    protected ChangeUiNodeEvent(UiNode<?> target) {
        super(target);
    }

    /**
     * Apply the change described by this event.
     */
    public abstract void apply();

    /**
     * Revert the change described by this event.
     */
    public abstract void revert();

    /**
     * Find all the rules that are activated by the this event.
     * Rule adding order is self -> descendants -> ancestors.
     * @return the activations.
     */
    @Override
    public Iterable<UiNodeRuleActivation> getActivations() {
        UiNodeEvent event = this;
        List<UiNodeRuleActivation> result = new ArrayList<>();
        UiNode<?> anchor = event.getTarget();
        do {
            //at the moment rules have to declare the concrete event class they want to listen to.
            for (UiNodeRule<?, ?> rule : anchor.getAttachedRules(event.getClass())) {
                if (rule.canFire(event)) {
                    UiNodeRuleActivation activation = new UiNodeRuleActivation(rule, event);
                    result.add(activation);
                }
            }
            anchor = anchor.getParent();
        } while (anchor != null);

        return result;
    }

}
