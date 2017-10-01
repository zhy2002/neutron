package zhy2002.neutron.core.event;

import zhy2002.neutron.core.StateChangeEvent;
import zhy2002.neutron.core.UiNode;

/**
 * Have this capturing type for each leaf value type.
 */
public class StringStateChangeEvent extends StateChangeEvent<String> {
    StringStateChangeEvent(UiNode<?> target, String key) {
        super(target, key);
    }
}
