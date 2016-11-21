package zhy2002.neutron.rule;

import zhy2002.neutron.UiNodeEventTypeEnum;
import zhy2002.neutron.StateChangeEvent;
import zhy2002.neutron.UiNode;

/**
 * State change validation rule.
 */
public abstract class ValidateStateChangeRule<T, N extends UiNode<?>>
        extends ValidationRule<StateChangeEvent<T>, N> {

    protected ValidateStateChangeRule(N owner) {
        super(owner);
    }

    @Override
    public UiNodeEventTypeEnum getEventType() {
        return UiNodeEventTypeEnum.StateChange;
    }
}
