package zhy2002.neutron.core;

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
        return UiNodeDirectionEnum.Up.getActivations(this);
    }

}
