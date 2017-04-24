package zhy2002.neutron.event;

import zhy2002.neutron.StateChangeEvent;
import zhy2002.neutron.UiNode;

import java.math.BigDecimal;

public class BigDecimalStateChangeEvent extends StateChangeEvent<BigDecimal> {

    BigDecimalStateChangeEvent(UiNode<?> target, String key) {
        super(target, key);
    }
}
