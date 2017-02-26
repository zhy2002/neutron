package zhy2002.examples.lodgement.gen.event;

import zhy2002.examples.lodgement.gen.node.ApplicationNode;
import zhy2002.neutron.NodeLoadEvent;


public class ApplicationNodeLoadEvent extends NodeLoadEvent<ApplicationNode> {

    public ApplicationNodeLoadEvent(ApplicationNode target) {
        super(target);
    }
}
