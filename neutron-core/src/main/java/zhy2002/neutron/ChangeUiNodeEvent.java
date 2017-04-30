package zhy2002.neutron;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a change change in the state or structure of the node tree.
 */
public abstract class ChangeUiNodeEvent extends UiNodeEvent {

    protected ChangeUiNodeEvent(UiNode<?> origin, String subject) {
        super(origin, subject);
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
     *
     * @return the activations.
     */
    @Override
    public final Iterable<BindingActivation> getActivations() {
        List<BindingActivation> result = new ArrayList<>();
        UiNode<?> anchor = this.getOrigin();
        do {
            addBindingActivations(result, anchor);
            anchor = anchor.getParent();
        } while (anchor != null);

        return result;
    }

    protected void addBindingActivations(List<BindingActivation> result, UiNode<?> anchor) {
        addBindingActivations(result, anchor, this.getEventKey());
    }

    void addBindingActivations(List<BindingActivation> result, UiNode<?> anchor, UiNodeEventKey<?> key) {
        //at the moment rules have to declare the concrete event class they want to listen to.
        for (EventBinding binding : anchor.getAttachedEventBindings(key)) {
            if (binding.canFire(this)) {
                BindingActivation activation = new BindingActivation(binding, this);
                result.add(activation);
            }
        }
    }
}
