package zhy2002.examples.lodgement.gen.event;

import zhy2002.examples.lodgement.gen.node.CompanyNode;
import zhy2002.neutron.NodeAddEvent;


public class CompanyNodeAddEvent extends NodeAddEvent<CompanyNode> {

    public CompanyNodeAddEvent(CompanyNode target) {
        super(target);
    }
}
