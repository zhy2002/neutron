package zhy2002.neutron.event;

import zhy2002.neutron.StateChangeEvent;
import zhy2002.neutron.UiNode;

public class ObjectStateChangeEvent extends StateChangeEvent<Object> {

    public ObjectStateChangeEvent(UiNode<?> target, String key) {
        super(target, key);
    }

}
