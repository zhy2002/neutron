package zhy2002.examples.app.data;

import zhy2002.neutron.NodeActionEvent;
import zhy2002.neutron.UiNode;

/**
 * An action that adds an open app to the list.
 */
public class AddOpenAppActionEvent extends NodeActionEvent<Object> {

    public AddOpenAppActionEvent(UiNode<?> origin, Object parameter) {
        super(origin, parameter);
    }
}
