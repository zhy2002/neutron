package zhy2002.neutron.event;

import zhy2002.neutron.NodeActionEvent;
import zhy2002.neutron.UiNode;

/**
 * An action that carries an object parameter.
 */
public class ObjectActionEvent extends NodeActionEvent<Object> {

    public ObjectActionEvent(UiNode<?> origin, String subject, Object parameter) {
        super(origin, subject, parameter);
    }
}
