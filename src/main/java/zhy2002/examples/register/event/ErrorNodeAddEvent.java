package zhy2002.examples.register.event;

import zhy2002.examples.register.ErrorNode;
import zhy2002.neutron.NodeAddEvent;

/**
 * Strong type event for adding ErrorNode.
 */
public class ErrorNodeAddEvent extends NodeAddEvent<ErrorNode> {

    public ErrorNodeAddEvent(ErrorNode target) {
        super(target);
    }
}
