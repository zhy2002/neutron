package zhy2002.neutron.core.event;

import zhy2002.neutron.core.NodeActionEvent;
import zhy2002.neutron.core.UiNode;

/**
 * An action that carries an object parameter.
 */
public class ObjectActionEvent extends NodeActionEvent<Object> {

    public ObjectActionEvent(UiNode<?> origin, String subject, Object parameter) {
        super(origin, subject, parameter);
    }
}
