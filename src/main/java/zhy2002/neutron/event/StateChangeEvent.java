package zhy2002.neutron.event;

import zhy2002.neutron.EventTypeEnum;
import zhy2002.neutron.UiNodeRuleActivation;
import zhy2002.neutron.node.UiNode;
import zhy2002.neutron.rule.UiNodeRule;

import java.util.ArrayList;
import java.util.List;

/**
 * This event is fired when a state property of a node is set.
 */
public final class StateChangeEvent<T> extends UiNodeEvent {
    private final String stateKey;
    private T oldValue;
    private T newValue;

    public StateChangeEvent(UiNode<?> target, String key) {
        super(target);
        this.stateKey = key;
    }


    public String getStateKey() {
        return stateKey;
    }

    public T getOldValue() {
        return oldValue;
    }

    public void setOldValue(T oldValue) {
        this.oldValue = oldValue;
    }

    public T getNewValue() {
        return newValue;
    }

    public void setNewValue(T newValue) {
        this.newValue = newValue;
    }

    public final EventTypeEnum getEventType() {
        return EventTypeEnum.StateChange;
    }

    @Override
    public Iterable<UiNodeRuleActivation> getActivations() {
        List<UiNodeRuleActivation> result = new ArrayList<>();
        UiNode<?> anchor = getTarget();
        do {
            for (UiNodeRule<?, ?> rule : anchor.getAttachedRules()) {
                if (rule.isObservedUiNode(getTarget())) {
                    UiNodeRuleActivation activation = new UiNodeRuleActivation(rule, this, anchor);
                    result.add(activation);
                }
            }
            anchor = anchor.getParent();
        } while (anchor != null);

        return result;
    }

    @Override
    public void apply() {
        getTarget().setStateValueInternal(getStateKey(), getNewValue());
    }

    @Override
    public void revert() {
        getTarget().setStateValueInternal(getStateKey(), getOldValue());
    }
}
