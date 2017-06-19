package zhy2002.neutron.rule;

import zhy2002.neutron.EventBinding;
import zhy2002.neutron.ObjectUiNode;
import zhy2002.neutron.ValidationRule;
import zhy2002.neutron.di.Owner;
import zhy2002.neutron.event.AnyStateChangeEventBinding;
import zhy2002.neutron.util.CollectionUtil;

import javax.inject.Inject;
import java.util.Collection;

/**
 * Optional rule that validates an ObjectUiNode must have value.
 * todo rename this to CompositeFieldRequiredValidationRule to make its intention clear.
 */
public class ObjectValueRequiredValidationRule extends ValidationRule<ObjectUiNode<?>> {

    @Inject
    public ObjectValueRequiredValidationRule(@Owner ObjectUiNode<?> owner) {
        super(owner);
    }

    @Override
    protected Collection<EventBinding> createEventBindings() {
        return CollectionUtil.combine(
                super.createEventBindings(),
                new AnyStateChangeEventBinding(
                        e -> e.getOrigin().getParent() == getOwner(),
                        e -> validate()
                )
        );
    }

    @Override
    protected String getErrorMessage() {
        Boolean required = getOwner().getRequired();
        if (Boolean.TRUE.equals(required) && !getOwner().hasValue())
            return getOwner().getRequiredMessage().replace("{label}", getOwner().getNodeLabel());
        return null;
    }
}
