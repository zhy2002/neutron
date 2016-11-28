package zhy2002.examples.register;

import zhy2002.neutron.StateChangeEvent;
import zhy2002.neutron.StateChangeEventFactory;
import zhy2002.neutron.UiNode;
import zhy2002.neutron.event.StringStateChangeEvent;

/**
 * Event factory.
 */
public class StringStateChangeEventFactory extends StateChangeEventFactory<String> {

    @Override
    public StateChangeEvent<String> create(UiNode<?> target, String key, String oldValue, String newValue) {
        return init(new StringStateChangeEvent(target, key), oldValue, newValue);
    }
}

