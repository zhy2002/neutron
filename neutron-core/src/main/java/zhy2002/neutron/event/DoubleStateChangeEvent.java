package zhy2002.neutron.event;

import zhy2002.neutron.StateChangeEvent;
import zhy2002.neutron.UiNode;

public class DoubleStateChangeEvent extends StateChangeEvent<Double> {

    DoubleStateChangeEvent(UiNode<?> target, String key) {
        super(target, key);
    }
}
