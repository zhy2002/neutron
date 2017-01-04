package zhy2002.neutron.rule;

import zhy2002.neutron.EventBinding;
import zhy2002.neutron.LeafUiNode;
import zhy2002.neutron.StateChangeEvent;
import zhy2002.neutron.ValidationRule;
import zhy2002.neutron.event.BooleanStateChangeEventBinding;
import zhy2002.neutron.event.GenericStateChangeEventBinding;
import zhy2002.neutron.util.CollectionUtil;
import zhy2002.neutron.util.NeutronEventSubjects;

import java.util.Collection;
import java.util.Collections;

public class LeafValueRequiredValidationRule extends ValidationRule<LeafUiNode<?, ?>> {

    public LeafValueRequiredValidationRule(LeafUiNode<?, ?> owner) {
        super(owner);
    }

    @Override
    protected Collection<EventBinding> createEventBindings() {
        StateChangeEvent<?> stateChangeEvent = getContext().createStateChangeEvent(getOwner(), "", getOwner().getValueClass(), null, null);

        return CollectionUtil.combine(
                super.createEventBindings(),
                new GenericStateChangeEventBinding<>(
                        e -> validate(),
                        stateChangeEvent.getClass()
                ),
                new BooleanStateChangeEventBinding(
                        e -> validate(),
                        Collections.singletonList(NeutronEventSubjects.REQUIRED)
                )
        );
    }

    @Override
    protected String getErrorMessage() {
        return getOwner().getRequiredMessage();
    }

    @Override
    protected boolean isActivated() {
        Boolean required = getOwner().getRequired();
        return Boolean.TRUE.equals(required) && !getOwner().hasValue();
    }
}
