package zhy2002.examples.app.gen.event;

import zhy2002.examples.app.gen.node.OpenAppNode;
import zhy2002.neutron.NodeRemoveEvent;


public class OpenAppNodeRemoveEvent extends NodeRemoveEvent<OpenAppNode> {
    public OpenAppNodeRemoveEvent(OpenAppNode target) {
        super(target);
    }
}