package zhy2002.neutron.event;

import zhy2002.neutron.UiNodeRuleActivation;
import zhy2002.neutron.node.UiNode;

import java.util.ArrayList;

/**
 * This event is fired when a state property of a node is set.
 */
public class StateChangeEvent<T> extends UiNodeEvent {
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

    @Override
    public Iterable<UiNodeRuleActivation> getActivations() {
        return new ArrayList<>();
    }
}
