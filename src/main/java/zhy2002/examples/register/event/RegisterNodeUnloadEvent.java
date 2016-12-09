package zhy2002.examples.register.event;

import zhy2002.examples.register.RegisterNode;
import zhy2002.neutron.NodeUnloadEvent;
import zhy2002.neutron.UiNode;

public class RegisterNodeUnloadEvent extends NodeUnloadEvent<RegisterNode> {
    public RegisterNodeUnloadEvent(UiNode<?> target) {
        super(target);
    }
}
