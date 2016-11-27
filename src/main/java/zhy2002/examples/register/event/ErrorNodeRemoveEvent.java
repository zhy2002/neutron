package zhy2002.examples.register.event;

import zhy2002.examples.register.ErrorNode;
import zhy2002.neutron.NodeRemoveEvent;
import zhy2002.neutron.UiNodeRuleActivation;

/**
 * Strong type event for removing an error node.
 * For each node type whose parent is a list node, this strong type event is generated.
 */
public class ErrorNodeRemoveEvent extends NodeRemoveEvent<ErrorNode> {
    public ErrorNodeRemoveEvent(ErrorNode target) {
        super(target);
    }
}
