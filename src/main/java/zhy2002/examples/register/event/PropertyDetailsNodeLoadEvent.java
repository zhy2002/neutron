package zhy2002.examples.register.event;


import zhy2002.examples.register.PropertyDetailsNode;
import zhy2002.neutron.NodeLoadEvent;
import zhy2002.neutron.UiNode;

public class PropertyDetailsNodeLoadEvent extends NodeLoadEvent<PropertyDetailsNode> {

    public PropertyDetailsNodeLoadEvent(UiNode<?> target) {
        super(target);
    }
}
