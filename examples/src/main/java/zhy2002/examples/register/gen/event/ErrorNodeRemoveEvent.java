package zhy2002.examples.register.gen.event;

import zhy2002.examples.register.gen.node.ErrorNode;
import zhy2002.neutron.NodeRemoveEvent;


public class ErrorNodeRemoveEvent extends NodeRemoveEvent<ErrorNode> {
    public ErrorNodeRemoveEvent(ErrorNode target) {
        super(target);
    }
}