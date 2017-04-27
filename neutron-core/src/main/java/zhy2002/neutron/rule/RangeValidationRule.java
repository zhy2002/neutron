package zhy2002.neutron.rule;

import zhy2002.neutron.EventBinding;
import zhy2002.neutron.ValidationRule;
import zhy2002.neutron.di.Owner;
import zhy2002.neutron.event.BigDecimalStateChangeEventBinding;
import zhy2002.neutron.node.BigDecimalUiNode;
import zhy2002.neutron.util.CollectionUtil;

import javax.inject.Inject;
import java.math.BigDecimal;
import java.util.Collection;

/**
 * Built in validation for BigDecimal value range.
 */
public class RangeValidationRule extends ValidationRule<BigDecimalUiNode<?>> {

    @Inject
    public RangeValidationRule(@Owner BigDecimalUiNode<?> owner) {
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
            return getOwner().getRangeMessage();
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
