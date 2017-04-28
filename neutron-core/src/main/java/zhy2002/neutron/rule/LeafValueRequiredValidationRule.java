package zhy2002.neutron.rule;

import zhy2002.neutron.EventBinding;
import zhy2002.neutron.LeafUiNode;
import zhy2002.neutron.StateChangeEvent;
import zhy2002.neutron.ValidationRule;
import zhy2002.neutron.di.Owner;
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
                )//,
//                new BooleanStateChangeEventBinding(
//                        e -> validate(),
//                        Collections.singletonList(NeutronConstants.REQUIRED)
//                )
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
