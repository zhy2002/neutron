package zhy2002.neutron.event;

import zhy2002.neutron.node.UiNode;

/**
 * This event is fired when a state property of a node is set.
 */
public class StateChangeEvent extends UiNodeEvent {

    private String propertyName;
    private UiNode<?> origin;

    public StateChangeEvent(UiNode<?> origin, String propertyName) {
        this.origin = origin;
        this.propertyName = propertyName;
    }

    public UiNode<?> getOrigin() {
        return origin;
    }

    public String getPropertyName() {
        return propertyName;
    }
}
