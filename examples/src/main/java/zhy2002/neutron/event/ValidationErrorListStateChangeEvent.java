package zhy2002.neutron.event;

import zhy2002.neutron.StateChangeEvent;
import zhy2002.neutron.UiNode;
import zhy2002.neutron.data.ValidationErrorList;

public class ValidationErrorListStateChangeEvent extends StateChangeEvent<ValidationErrorList> {

    public ValidationErrorListStateChangeEvent(UiNode<?> target, String key) {
        super(target, key);
    }
}
