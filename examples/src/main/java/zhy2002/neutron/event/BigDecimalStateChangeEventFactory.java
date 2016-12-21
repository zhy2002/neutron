package zhy2002.neutron.event;


import zhy2002.neutron.StateChangeEvent;
import zhy2002.neutron.StateChangeEventFactory;
import zhy2002.neutron.UiNode;

import java.math.BigDecimal;

public class BigDecimalStateChangeEventFactory implements StateChangeEventFactory<BigDecimal> {


    @Override
    public StateChangeEvent<BigDecimal> create(UiNode<?> target, String key) {
        return new BigDecimalStateChangeEvent(target, key);
    }
}
