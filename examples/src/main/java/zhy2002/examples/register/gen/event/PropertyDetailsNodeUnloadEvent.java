package zhy2002.examples.register.gen.event;

import zhy2002.examples.register.gen.PropertyDetailsNode;
import zhy2002.neutron.NodeUnloadEvent;
import zhy2002.neutron.UiNode;

public class PropertyDetailsNodeUnloadEvent extends NodeUnloadEvent<PropertyDetailsNode> {

    public PropertyDetailsNodeUnloadEvent(PropertyDetailsNode target) {
        super(target);
    }
}
