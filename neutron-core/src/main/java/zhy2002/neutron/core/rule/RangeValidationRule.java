package zhy2002.neutron.core.rule;

import zhy2002.neutron.core.EventBinding;
import zhy2002.neutron.core.ValidationRule;
import zhy2002.neutron.core.event.BigDecimalStateChangeEventBinding;
import zhy2002.neutron.core.node.BigDecimalUiNode;
import zhy2002.neutron.core.util.CollectionUtil;

import java.math.BigDecimal;
import java.util.Collection;

/**
 * Built in validation for BigDecimal value range.
 */
public class RangeValidationRule extends ValidationRule<BigDecimalUiNode<?>> {

    public RangeValidationRule(BigDecimalUiNode<?> owner) {
        super(owner);
    }

    @Override
    protected Collection<EventBinding> createEventBindings() {
        return CollectionUtil.combine(
                super.createEventBindings(),
                new BigDecimalStateChangeEventBinding(e -> validate())
        );
    }

    @Override
    protected String getErrorMessage() {
        if (isActivated())
            return getOwner().getRangeMessage()
                    .replace("{min}", String.valueOf(getOwner().getMinValue()))
                    .replace("{max}", String.valueOf(getOwner().getMaxValue()));
        return null;
    }

    private boolean isActivated() {
        BigDecimal value = getOwner().getValue();
        if (value == null)
            return false;

        BigDecimal min = getOwner().getMinValue();
        if (min != null && value.compareTo(min) < 0)
            return true;

        BigDecimal max = getOwner().getMaxValue();
        if (max != null && value.compareTo(max) > 0)
            return true;

        return false;
    }
}
