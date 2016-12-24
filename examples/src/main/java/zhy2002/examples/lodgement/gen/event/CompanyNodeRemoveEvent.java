package zhy2002.examples.lodgement.gen.event;

import zhy2002.examples.lodgement.gen.CompanyNode;
import zhy2002.neutron.NodeRemoveEvent;


public class CompanyNodeRemoveEvent extends NodeRemoveEvent<CompanyNode> {
    public CompanyNodeRemoveEvent(CompanyNode target) {
        super(target);
    }
}