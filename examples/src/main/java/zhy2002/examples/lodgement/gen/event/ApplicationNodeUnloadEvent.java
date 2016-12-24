package zhy2002.examples.lodgement.gen.event;

import zhy2002.examples.lodgement.gen.ApplicationNode;
import zhy2002.neutron.NodeUnloadEvent;
import zhy2002.neutron.UiNode;

public class ApplicationNodeUnloadEvent extends NodeUnloadEvent<ApplicationNode> {

    public ApplicationNodeUnloadEvent(UiNode<?> target) {
        super(target);
    }
}
