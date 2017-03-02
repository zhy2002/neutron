package zhy2002.neutron.event;

import zhy2002.neutron.StateChangeEvent;
import zhy2002.neutron.StateChangeEventFactory;
import zhy2002.neutron.UiNode;

/**
 * Event factory.
 */
public class StringStateChangeEventFactory implements StateChangeEventFactory<String> {

    @Override
    public StateChangeEvent<String> create(UiNode<?> target, String key) {
        return new StringStateChangeEvent(target, key);
    }
}

