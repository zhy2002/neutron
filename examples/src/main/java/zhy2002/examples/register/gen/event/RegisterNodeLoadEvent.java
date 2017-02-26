package zhy2002.examples.register.gen.event;

import zhy2002.examples.register.gen.node.RegisterNode;
import zhy2002.neutron.NodeLoadEvent;


public class RegisterNodeLoadEvent extends NodeLoadEvent<RegisterNode> {

    public RegisterNodeLoadEvent(RegisterNode target) {
        super(target);
    }
}
