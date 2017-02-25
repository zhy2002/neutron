package zhy2002.examples.register.gen.event;

import zhy2002.examples.register.gen.PropertyDetailsNode;
import zhy2002.neutron.NodeLoadEvent;
import zhy2002.neutron.UiNode;

public class PropertyDetailsNodeLoadEvent extends NodeLoadEvent<PropertyDetailsNode> {

    public PropertyDetailsNodeLoadEvent(PropertyDetailsNode target) {
        super(target);
    }
}
