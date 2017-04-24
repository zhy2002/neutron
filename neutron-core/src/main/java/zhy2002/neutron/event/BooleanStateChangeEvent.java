package zhy2002.neutron.event;

import zhy2002.neutron.StateChangeEvent;
import zhy2002.neutron.UiNode;

public class BooleanStateChangeEvent extends StateChangeEvent<Boolean> {

    BooleanStateChangeEvent(UiNode<?> target, String key) {
        super(target, key);
    }
}
