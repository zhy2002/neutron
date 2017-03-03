package zhy2002.neutron;

import zhy2002.examples.lodgement.gen.node.MonthYearNode;
import zhy2002.neutron.EventBinding;
import zhy2002.neutron.UiNode;
import zhy2002.neutron.ValidationRule;
import zhy2002.neutron.event.BigDecimalStateChangeEvent;
import zhy2002.neutron.event.BigDecimalStateChangeEventBinding;

import java.math.BigDecimal;
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
     * @return owner node ge this returned node.
     */
    protected abstract MonthYearNode<?> getOtherMonthYearNode();

    @Override
    protected String getErrorMessage() {
        MonthYearNode<?> otherNode = getOtherMonthYearNode();
        BigDecimal year1 = otherNode.getYearNode().getValue();
        BigDecimal month1 = otherNode.getMonthNode().getValue();
        BigDecimal year2 = getOwner().getYearNode().getValue();
        BigDecimal month2 = getOwner().getMonthNode().getValue();

        int yearComp = year2.compareTo(year1);
        if (yearComp > 0)
            return null;
        if (yearComp < 0 || month2.compareTo(month1) < 0)
            return "Cannot be earlier than " + otherNode.getNodeLabel();

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
