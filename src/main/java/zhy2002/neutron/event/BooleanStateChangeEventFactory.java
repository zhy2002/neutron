package zhy2002.neutron.event;

import zhy2002.neutron.StateChangeEvent;
import zhy2002.neutron.StateChangeEventFactory;
import zhy2002.neutron.UiNode;

public class BooleanStateChangeEventFactory extends StateChangeEventFactory<Boolean> {
    @Override
    public StateChangeEvent<Boolean> create(UiNode<?> target, String key, Boolean oldValue, Boolean newValue) {
        return init(new BooleanStateChangeEvent(target, key), oldValue, newValue);
    }
}
