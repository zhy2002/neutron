package zhy2002.examples.register.rules;

import zhy2002.neutron.event.StateChangeEvent;
import zhy2002.neutron.node.UiNode;

/**
 * State change validation rule.
 */
public abstract class StateChangeValidationRule<T, N extends UiNode<?>>
        extends ValidationRule<StateChangeEvent<T>, N> {

    protected StateChangeValidationRule(N owner) {
        super(owner);
    }
}
