package zhy2002.mortgage.application.rule;

import zhy2002.mortgage.application.gen.node.MonthYearNode;
import zhy2002.neutron.core.EventBinding;
import zhy2002.neutron.core.UiNode;
import zhy2002.neutron.core.ValidationRule;
import zhy2002.neutron.core.event.BigDecimalStateChangeEvent;
import zhy2002.neutron.core.event.BigDecimalStateChangeEventBinding;

import java.util.Collection;
import java.util.Collections;

public abstract class MonthYearNoEarlierThanRule<N extends MonthYearNode<?>> extends ValidationRule<N> {

    public MonthYearNoEarlierThanRule(N owner) {
        super(owner);
    }

    @Override
    protected UiNode<?> findHost() {
        return getOwner().getParent();
    }

    /**
     * Must be in the same parent as owner node.
     *
     * @return owner node ge this returned node.
     */
    protected abstract MonthYearNode<?> getOtherMonthYearNode();

    @Override
    protected String getErrorMessage() {
        MonthYearNode<?> otherNode = getOtherMonthYearNode();
        Double year1 = otherNode.getYearNode().getValue();
        Double month1 = otherNode.getMonthNode().getValue();
        Double year2 = getOwner().getYearNode().getValue();
        Double month2 = getOwner().getMonthNode().getValue();

        if (year1 != null && year2 != null) {
            int yearComp = year2.compareTo(year1);
            if (yearComp > 0)
                return null;

            if (yearComp < 0 || month1 != null && month2 != null && month2.compareTo(month1) < 0)
                return "Cannot be earlier than " + otherNode.getNodeLabel();
        }

        return null;
    }

    @Override
    protected Collection<EventBinding> createEventBindings() {
        return Collections.singletonList(
                new BigDecimalStateChangeEventBinding(
                        this::filter,
                        (e) -> validate()
                )
        );
    }

    private boolean filter(BigDecimalStateChangeEvent event) {
        if (event.getOrigin().getParent() == null)
            return false;

        UiNode<?> node = event.getOrigin().getParent();
        if (node != getOwner() && node != getOtherMonthYearNode())
            return false;

        return getOwner().getMonthNode().hasValue()
                && getOwner().getYearNode().hasValue()
                && getOtherMonthYearNode().getMonthNode().hasValue()
                && getOtherMonthYearNode().getYearNode().hasValue();
    }

}
