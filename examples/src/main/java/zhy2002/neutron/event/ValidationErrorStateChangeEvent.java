package zhy2002.neutron.event;

import zhy2002.neutron.StateChangeEvent;
import zhy2002.neutron.UiNode;
import zhy2002.neutron.data.ValidationError;

public class ValidationErrorStateChangeEvent extends StateChangeEvent<ValidationError> {

    public ValidationErrorStateChangeEvent(UiNode<?> target, String key) {
        super(target, key);
    }
}
