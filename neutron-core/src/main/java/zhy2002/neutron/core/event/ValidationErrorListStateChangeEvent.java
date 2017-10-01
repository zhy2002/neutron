package zhy2002.neutron.core.event;

import zhy2002.neutron.core.StateChangeEvent;
import zhy2002.neutron.core.UiNode;
import zhy2002.neutron.core.data.ValidationErrorList;

public class ValidationErrorListStateChangeEvent extends StateChangeEvent<ValidationErrorList> {

    ValidationErrorListStateChangeEvent(UiNode<?> target, String key) {
        super(target, key);
    }
}
