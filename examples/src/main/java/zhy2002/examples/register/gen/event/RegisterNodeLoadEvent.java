package zhy2002.examples.register.gen.event;

import zhy2002.examples.register.gen.RegisterNode;
import zhy2002.neutron.NodeLoadEvent;
import zhy2002.neutron.UiNode;

public class RegisterNodeLoadEvent extends NodeLoadEvent<RegisterNode> {

    public RegisterNodeLoadEvent(UiNode<?> target) {
        super(target);
    }
}
