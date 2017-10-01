package zhy2002.neutron.core.rule;

import zhy2002.neutron.core.EventBinding;
import zhy2002.neutron.core.ValidationRule;
import zhy2002.neutron.core.event.BooleanStateChangeEventBinding;
import zhy2002.neutron.core.node.BigDecimalUiNode;
import zhy2002.neutron.core.util.CollectionUtil;

import java.util.Collection;

/**
 * Validate whether the text in a BigDecimalUiNode is a valid number.
 */
public class NumberFormatValidationRule extends ValidationRule<BigDecimalUiNode<?>> {

    public NumberFormatValidationRule(BigDecimalUiNode<?> owner) {
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
        if (!getOwner().isValueValid())
            return "Not a valid number";

        if (getOwner().isIntegerValue() && getOwner().getText().contains("."))
            return "Not an integer";

        return null;
    }

}
