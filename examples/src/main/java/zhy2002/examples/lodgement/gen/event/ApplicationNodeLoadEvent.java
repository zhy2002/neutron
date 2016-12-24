package zhy2002.examples.lodgement.gen.event;

import zhy2002.examples.lodgement.gen.ApplicationNode;
import zhy2002.neutron.NodeLoadEvent;
import zhy2002.neutron.UiNode;

public class ApplicationNodeLoadEvent extends NodeLoadEvent<ApplicationNode> {

    public ApplicationNodeLoadEvent(UiNode<?> target) {
        super(target);
    }
}
