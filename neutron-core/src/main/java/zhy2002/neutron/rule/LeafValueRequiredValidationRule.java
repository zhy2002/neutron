package zhy2002.neutron.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.di.Owner;
import zhy2002.neutron.event.BooleanStateChangeEventBinding;
import zhy2002.neutron.event.GenericStateChangeEventBinding;
import zhy2002.neutron.util.CollectionUtil;

import javax.inject.Inject;
import java.util.Collection;

/**
 * Built in value required validation for leafUiNode.
 */
public class LeafValueRequiredValidationRule extends ValidationRule<LeafUiNode<?, ?>> {

    @Inject
    public LeafValueRequiredValidationRule(@Owner LeafUiNode<?, ?> owner) {
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
                        UiNode.REQUIRED_PROPERTY.getStateKey()
                )
        );
    }

    @Override
    protected String getErrorMessage() {
        if (isActivated())
            return getOwner().getRequiredMessage();
        return null;
    }

    private boolean isActivated() {
        Boolean required = getOwner().getRequired();
        return Boolean.TRUE.equals(required) && !getOwner().hasValue();
    }
}
