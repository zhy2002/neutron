package zhy2002.neutron;

import zhy2002.neutron.event.ObjectStateChangeEvent;

public class ObjectStateChangeEventFactory implements StateChangeEventFactory<Object> {

    @Override
    public StateChangeEvent<Object> create(UiNode<?> target, String key) {

        return new ObjectStateChangeEvent(target, key);
    }
}
