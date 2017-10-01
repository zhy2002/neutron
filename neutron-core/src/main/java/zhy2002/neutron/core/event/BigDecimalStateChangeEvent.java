package zhy2002.neutron.core.event;

import zhy2002.neutron.core.StateChangeEvent;
import zhy2002.neutron.core.UiNode;

import java.math.BigDecimal;

public class BigDecimalStateChangeEvent extends StateChangeEvent<BigDecimal> {

    BigDecimalStateChangeEvent(UiNode<?> target, String key) {
        super(target, key);
    }
}
