package zhy2002.neutron;

import zhy2002.neutron.rule.UiNodeRule;

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

    @Override
    public Iterable<UiNodeRuleActivation> getActivations() {
        UiNodeEvent event = this;
        List<UiNodeRuleActivation> result = new ArrayList<>();
        UiNode<?> anchor = event.getTarget();
        do {
            for (UiNodeRule<?, ?> rule : anchor.getAttachedRules(event.getClass())) {//todo not right, event inheritance
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
