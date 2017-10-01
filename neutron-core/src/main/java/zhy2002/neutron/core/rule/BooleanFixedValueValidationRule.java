package zhy2002.neutron.core.rule;

import zhy2002.neutron.core.EventBinding;
import zhy2002.neutron.core.ValidationRule;
import zhy2002.neutron.core.di.Owner;
import zhy2002.neutron.core.event.BooleanStateChangeEventBinding;
import zhy2002.neutron.core.node.BooleanUiNode;
import zhy2002.neutron.core.util.CollectionUtil;

import javax.inject.Inject;
import java.util.Collection;

/**
 * Optional validation rule for BooleanUiNode.
 */
public class BooleanFixedValueValidationRule extends ValidationRule<BooleanUiNode<?>> {

    @Inject
    public BooleanFixedValueValidationRule(@Owner BooleanUiNode<?> owner) {
        super(owner);
    }

    @Override
    protected Collection<EventBinding> createEventBindings() {
        return CollectionUtil.combine(
                super.createEventBindings(),
                new BooleanStateChangeEventBinding(e -> validate()),
                new BooleanStateChangeEventBinding(
                        e -> validate(),
                        BooleanUiNode.FIXED_VALUE_PROPERTY.getStateKey()
                )
        );
    }

    @Override
    protected String getErrorMessage() {
        Boolean fixedValue = getOwner().getFixedValue();
        Boolean value = getOwner().getValue();
        if (fixedValue == null || value == null)
            return null;

        if (fixedValue.equals(value))
            return null;

        return "Value must be " + fixedValue;
    }
}
