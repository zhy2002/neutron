package zhy2002.examples.register.gen.event;

import zhy2002.examples.register.gen.node.PropertyDetailsNode;
import zhy2002.neutron.NodeLoadEvent;


public class PropertyDetailsNodeLoadEvent extends NodeLoadEvent<PropertyDetailsNode> {

    public PropertyDetailsNodeLoadEvent(PropertyDetailsNode target) {
        super(target);
    }
}
