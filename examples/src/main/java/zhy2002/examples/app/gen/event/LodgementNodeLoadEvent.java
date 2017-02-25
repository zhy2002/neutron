package zhy2002.examples.app.gen.event;

import zhy2002.examples.app.gen.LodgementNode;
import zhy2002.neutron.NodeLoadEvent;
import zhy2002.neutron.UiNode;

public class LodgementNodeLoadEvent extends NodeLoadEvent<LodgementNode> {

    public LodgementNodeLoadEvent(LodgementNode target) {
        super(target);
    }
}
