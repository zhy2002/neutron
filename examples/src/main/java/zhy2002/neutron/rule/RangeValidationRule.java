package zhy2002.neutron.rule;

import zhy2002.neutron.EventBinding;
import zhy2002.neutron.ValidationRule;
import zhy2002.neutron.event.BigDecimalStateChangeEventBinding;
import zhy2002.neutron.node.BigDecimalUiNode;
import zhy2002.neutron.util.CollectionUtil;

import java.math.BigDecimal;
import java.util.Collection;

public class RangeValidationRule extends ValidationRule<BigDecimalUiNode<?>> {

    public RangeValidationRule(BigDecimalUiNode owner) {
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
        return getOwner().getRangeMessage();
    }

    @Override
    protected boolean isActivated() {
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