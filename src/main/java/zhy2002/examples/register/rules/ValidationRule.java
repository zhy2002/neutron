package zhy2002.examples.register.rules;

import zhy2002.neutron.event.DefaultPhases;
import zhy2002.neutron.event.UiNodeEvent;
import zhy2002.neutron.node.UiNode;
import zhy2002.neutron.node.UiNodeRule;

/**
 * Base class for validation rules.
 */
public abstract class ValidationRule<T extends UiNode<?>> extends UiNodeRule<T> {

    protected ValidationRule(T host) {
        super(host, DefaultPhases.Validate);
    }

    @Override
    public void fire(UiNodeEvent event) {
        if (isActivated(event)) {
            activate(event);
        } else {
            deactivate(event);
        }
    }

    protected abstract boolean isActivated(UiNodeEvent event);

    protected abstract void activate(UiNodeEvent event);

    protected abstract void deactivate(UiNodeEvent event);

}
