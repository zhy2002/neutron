package zhy2002.examples.lodgement.gen.event;

import zhy2002.examples.lodgement.gen.ErrorNode;
import zhy2002.neutron.NodeAddEvent;


public class ErrorNodeAddEvent extends NodeAddEvent<ErrorNode> {

    public ErrorNodeAddEvent(ErrorNode target) {
        super(target);
    }
}
