package zhy2002.neutron;

/**
 * Change event.
 */
public abstract class ChangeUiNodeEvent extends UiNodeEvent{

    protected ChangeUiNodeEvent(UiNode<?> target, UiNodeRuleActivation activation) {
        super(target, activation);
    }

    /**
     * Apply the change described by this event.
     */
    public abstract void apply();

    /**
     * Revert the change described by this event.
     */
    public abstract void revert();

}
