package zhy2002.examples.register.event;

import zhy2002.examples.register.PropertyDetailsNode;
import zhy2002.neutron.NodeUnloadEvent;
import zhy2002.neutron.UiNode;

public class PropertyDetailsNodeUnloadEvent extends NodeUnloadEvent<PropertyDetailsNode> {

    public PropertyDetailsNodeUnloadEvent(UiNode<?> target) {
        super(target);
    }
}
