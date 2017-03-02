package zhy2002.examples.app.gen.event;

import zhy2002.examples.app.gen.node.LodgementNode;
import zhy2002.neutron.NodeUnloadEvent;
import zhy2002.neutron.UiNode;

public class LodgementNodeUnloadEvent extends NodeUnloadEvent<LodgementNode> {

    public LodgementNodeUnloadEvent(LodgementNode target) {
        super(target);
    }
}
