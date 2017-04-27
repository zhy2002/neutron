package zhy2002.neutron.rule;

import zhy2002.neutron.EventBinding;
import zhy2002.neutron.ValidationRule;
import zhy2002.neutron.di.Owner;
import zhy2002.neutron.event.BooleanStateChangeEventBinding;
import zhy2002.neutron.node.BigDecimalUiNode;
import zhy2002.neutron.util.CollectionUtil;

import javax.inject.Inject;
import java.util.Collection;

/**
 * Validate whether the text in a BigDecimalUiNode is a valid number.
 */
public class NumberFormatValidationRule extends ValidationRule<BigDecimalUiNode<?>> {

    @Inject
    public NumberFormatValidationRule(@Owner BigDecimalUiNode<?> owner) {
        super(owner);
    }

    @Override
    protected Collection<EventBinding> createEventBindings() {
        return CollectionUtil.combine(
                super.createEventBindings(),
                new BooleanStateChangeEventBinding(
                        e -> validate(),
                        BigDecimalUiNode.VALUE_VALID_PROPERTY.getStateKey()
                )
        );
    }

    @Override
    protected String getErrorMessage() {
        if (isActivated())
            return "Not a valid number";
        return null;
    }

    private boolean isActivated() {
        return !getOwner().isValueValid();
    }
}
