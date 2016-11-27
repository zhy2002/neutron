package zhy2002.neutron.event;

import zhy2002.neutron.StateChangeEvent;
import zhy2002.neutron.UiNode;
import zhy2002.neutron.UiNodeRuleActivation;

/**
 * Have this capturing type for each leaf value type.
 */
public class StringStateChangeEvent extends StateChangeEvent<String> {
    public StringStateChangeEvent(UiNode<?> target, String key) {
        super(target, key);
    }
}
