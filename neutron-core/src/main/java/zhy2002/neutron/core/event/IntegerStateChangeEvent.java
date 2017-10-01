package zhy2002.neutron.core.event;

import zhy2002.neutron.core.StateChangeEvent;
import zhy2002.neutron.core.UiNode;

public class IntegerStateChangeEvent extends StateChangeEvent<Integer> {

    IntegerStateChangeEvent(UiNode<?> target, String key) {
        super(target, key);
    }
}
