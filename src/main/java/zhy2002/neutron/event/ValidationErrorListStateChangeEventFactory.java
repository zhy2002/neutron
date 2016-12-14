package zhy2002.neutron.event;

import zhy2002.neutron.StateChangeEvent;
import zhy2002.neutron.StateChangeEventFactory;
import zhy2002.neutron.UiNode;
import zhy2002.neutron.rule.ValidationErrorList;

public class ValidationErrorListStateChangeEventFactory implements StateChangeEventFactory<ValidationErrorList> {
    @Override
    public StateChangeEvent<ValidationErrorList> create(UiNode<?> target, String key) {
        return new ValidationErrorListStateChangeEvent(target, key);
    }
}
