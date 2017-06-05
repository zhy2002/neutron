package zhy2002.examples.app.gen.event;

import zhy2002.examples.app.gen.node.GlobalUiStateNode;
import zhy2002.neutron.NodeLoadEvent;


public class GlobalUiStateNodeLoadEvent extends NodeLoadEvent<GlobalUiStateNode> {

    public GlobalUiStateNodeLoadEvent(GlobalUiStateNode target) {
        super(target);
    }
}
