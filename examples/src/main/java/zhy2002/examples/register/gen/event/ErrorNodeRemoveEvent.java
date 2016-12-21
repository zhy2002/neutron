package zhy2002.examples.register.gen.event;

import zhy2002.examples.register.gen.ErrorNode;
import zhy2002.neutron.NodeRemoveEvent;

/**
 * Strong type event for removing an error node.
 * For each node type whose parent is a list node, this strong type event is generated.
 */
public class ErrorNodeRemoveEvent extends NodeRemoveEvent<ErrorNode> {
    public ErrorNodeRemoveEvent(ErrorNode target) {
        super(target);
    }
}
