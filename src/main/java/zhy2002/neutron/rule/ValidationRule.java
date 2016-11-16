package zhy2002.neutron.rule;

import zhy2002.neutron.event.DefaultPhases;
import zhy2002.neutron.event.UiNodeEvent;
import zhy2002.neutron.node.UiNode;

/**
 * Base class for validation rules.
 */
public abstract class ValidationRule<E extends UiNodeEvent, N extends UiNode<?>>
        extends UiNodeRule<E, N> {

    protected ValidationRule(N owner) {
        super(owner, DefaultPhases.Validate);
    }

    @Override
    public void execute(E event) {
        if (isActivated(event)) {
            activate(event);
        } else {
            deactivate(event);
        }
    }

    protected abstract boolean isActivated(E event);

    protected abstract void activate(E event);

    protected abstract void deactivate(E event);

}
