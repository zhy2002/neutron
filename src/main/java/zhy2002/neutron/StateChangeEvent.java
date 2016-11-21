package zhy2002.neutron;

/**
 * This event is fired when a state property of a node is set.
 */
public final class StateChangeEvent<T> extends ChangeUiNodeEvent {
    private final String stateKey;
    private T oldValue;
    private T newValue;

    public StateChangeEvent(UiNode<?> target, String key, UiNodeRuleActivation activation) {
        super(target, activation);
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

    public final UiNodeEventTypeEnum getEventType() {
        return UiNodeEventTypeEnum.StateChange;
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
