package zhy2002.neutron.core.event;

import zhy2002.neutron.core.StateChangeEvent;
import zhy2002.neutron.core.UiNode;
import zhy2002.neutron.core.data.ValidationError;

public class ValidationErrorStateChangeEvent extends StateChangeEvent<ValidationError> {

    ValidationErrorStateChangeEvent(UiNode<?> target, String key) {
        super(target, key);
    }
}
