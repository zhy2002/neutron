package zhy2002.neutron.core.rule;

import zhy2002.neutron.core.*;
import zhy2002.neutron.core.di.Owner;
import zhy2002.neutron.core.event.BooleanStateChangeEventBinding;
import zhy2002.neutron.core.event.GenericStateChangeEventBinding;
import zhy2002.neutron.core.util.CollectionUtil;

import javax.inject.Inject;
import java.util.Collection;

/**
 * Built in value required validation for leafUiNode.
 */
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
                        stateChangeEvent.getClass(),
                        e -> {
                            if (e.getOrigin().hasValue()) {
                                validate();
                            }
                        },
                        getOwner().getValuePropertyMetadata().getStateKey()
                ),
                new BooleanStateChangeEventBinding(
                        e -> Boolean.FALSE.equals(e.getNewValue()),
                        e -> validate(),
                        UiNode.REQUIRED_PROPERTY.getStateKey()
                )
        );
    }

    @Override
    protected String getErrorMessage() {
        if (isActivated())
            return getOwner().getRequiredMessage().replace("{label}", getOwner().getNodeLabel());
        return null;
    }

    private boolean isActivated() {
        Boolean required = getOwner().getRequired();
        return Boolean.TRUE.equals(required) && !getOwner().hasValue();
    }
}
