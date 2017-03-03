package zhy2002.examples.app.gen.event;

import zhy2002.examples.app.gen.node.LodgementNode;
import zhy2002.neutron.NodeLoadEvent;


public class LodgementNodeLoadEvent extends NodeLoadEvent<LodgementNode> {

    public LodgementNodeLoadEvent(LodgementNode target) {
        super(target);
    }
}
