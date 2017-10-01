package zhy2002.neutron.core.event;

import zhy2002.neutron.core.NodeActionEvent;
import zhy2002.neutron.core.UiNode;


public class VoidActionEvent extends NodeActionEvent<Void> {

    public VoidActionEvent(UiNode<?> origin, String subject) {
        super(origin, subject, null);
    }
}
