package zhy2002.neutron.event;

import zhy2002.neutron.StateChangeEvent;
import zhy2002.neutron.StateChangeEventFactory;
import zhy2002.neutron.UiNode;

public class ObjectStateChangeEventFactory implements StateChangeEventFactory<Object> {

    @Override
    public StateChangeEvent<Object> create(UiNode<?> target, String key) {

        return new ObjectStateChangeEvent(target, key);
    }
}
