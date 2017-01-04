package zhy2002.neutron;

import java.util.ArrayList;
import java.util.List;

/**
 * Change event.
 */
public abstract class ChangeUiNodeEvent extends UiNodeEvent {

    protected ChangeUiNodeEvent(UiNode<?> target, String subject) {
        super(target, subject);
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
    public final Iterable<BindingActivation> getActivations() {
        UiNodeEvent event = this;
        List<BindingActivation> result = new ArrayList<>();
        UiNode<?> anchor = event.getOrigin();
        do {
            //at the moment rules have to declare the concrete event class they want to listen to.
            for (EventBinding binding : anchor.getAttachedEventBindings(event.getEventKey())) {
                if (binding.canFire(event)) {
                    BindingActivation activation = new BindingActivation(binding, event);
                    result.add(activation);
                }
            }
            anchor = anchor.getParent();
        } while (anchor != null);

        return result;
    }

}
