package zhy2002.neutron.core.event;

import zhy2002.neutron.core.StateChangeEvent;
import zhy2002.neutron.core.UiNode;

public class BooleanStateChangeEvent extends StateChangeEvent<Boolean> {

    BooleanStateChangeEvent(UiNode<?> target, String key) {
        super(target, key);
    }
}
