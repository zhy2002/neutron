package zhy2002.neutron.event;

import zhy2002.neutron.StateChangeEvent;
import zhy2002.neutron.UiNode;

/**
 * Have this capturing type for each leaf value type.
 */
public class StringStateChangeEvent extends StateChangeEvent<String> {
    public StringStateChangeEvent(UiNode<?> target, String key) {
        super(target, key);
    }
}
