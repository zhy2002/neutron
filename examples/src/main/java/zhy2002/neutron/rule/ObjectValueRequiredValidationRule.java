package zhy2002.neutron.rule;

import zhy2002.neutron.EventBinding;
import zhy2002.neutron.ObjectUiNode;
import zhy2002.neutron.ValidationRule;
import zhy2002.neutron.event.BooleanStateChangeEventBinding;
import zhy2002.neutron.util.CollectionUtil;
import zhy2002.neutron.util.NeutronEventSubjects;

import java.util.Collection;
import java.util.Collections;


public class ObjectValueRequiredValidationRule extends ValidationRule<ObjectUiNode<?>> {

    public ObjectValueRequiredValidationRule(ObjectUiNode<?> owner) {
        super(owner);
    }

    @Override
    protected Collection<EventBinding> createEventBindings() {
        return CollectionUtil.combine(
                super.createEventBindings(),
                new BooleanStateChangeEventBinding(
                        event -> event.getOrigin() == getOwner(),
                        event -> this.validate(),
                        Collections.singletonList(NeutronEventSubjects.HAS_VALUE),
                        null
                )
        );
    }

    @Override
    protected String getErrorMessage() {
        if(isActivated())
        return "Cannot be empty.";
        return null;
    }

    private boolean isActivated() {
        Boolean required = getOwner().getRequired();
        return Boolean.TRUE.equals(required) && !getOwner().hasValue();
    }
}
