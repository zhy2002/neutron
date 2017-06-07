package zhy2002.examples.app.gen.event;

import zhy2002.examples.app.gen.node.OpenAppNode;
import zhy2002.neutron.NodeAddEvent;


public class OpenAppNodeAddEvent extends NodeAddEvent<OpenAppNode> {

    public OpenAppNodeAddEvent(OpenAppNode target) {
        super(target);
    }
}
