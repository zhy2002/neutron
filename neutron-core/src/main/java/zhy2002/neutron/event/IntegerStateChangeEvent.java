package zhy2002.neutron.event;

import zhy2002.neutron.StateChangeEvent;
import zhy2002.neutron.UiNode;

public class IntegerStateChangeEvent extends StateChangeEvent<Integer> {

    IntegerStateChangeEvent(UiNode<?> target, String key) {
        super(target, key);
    }
}
