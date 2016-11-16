package zhy2002.neutron.rule;

import zhy2002.neutron.EventTypeEnum;
import zhy2002.neutron.event.StateChangeEvent;
import zhy2002.neutron.node.UiNode;

/**
 * State change validation rule.
 */
public abstract class ValidateStateChangeRule<T, N extends UiNode<?>>
        extends ValidationRule<StateChangeEvent<T>, N> {

    protected ValidateStateChangeRule(N owner) {
        super(owner);
    }

    @Override
    public EventTypeEnum getEventType() {
        return EventTypeEnum.StateChange;
    }
}
