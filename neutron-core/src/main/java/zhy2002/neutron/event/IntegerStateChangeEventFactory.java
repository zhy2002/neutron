package zhy2002.neutron.event;

import zhy2002.neutron.StateChangeEventFactory;
import zhy2002.neutron.UiNode;


public class IntegerStateChangeEventFactory implements StateChangeEventFactory<Integer> {

    @Override
    public IntegerStateChangeEvent create(UiNode<?> target, String key) {
        return new IntegerStateChangeEvent(target, key);
    }
}
