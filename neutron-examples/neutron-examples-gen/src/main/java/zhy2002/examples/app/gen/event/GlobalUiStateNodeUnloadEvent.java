package zhy2002.examples.app.gen.event;

import zhy2002.examples.app.gen.node.GlobalUiStateNode;
import zhy2002.neutron.NodeUnloadEvent;
import zhy2002.neutron.UiNode;

public class GlobalUiStateNodeUnloadEvent extends NodeUnloadEvent<GlobalUiStateNode> {

    public GlobalUiStateNodeUnloadEvent(GlobalUiStateNode target) {
        super(target);
    }
}
