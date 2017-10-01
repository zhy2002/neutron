package zhy2002.mortgage.application.shared;

import zhy2002.mortgage.application.gen.event.OwnershipNodeRemoveEvent;
import zhy2002.mortgage.application.gen.node.OwnershipListNode;
import zhy2002.mortgage.application.gen.node.OwnershipPercentageNode;
import zhy2002.neutron.core.EventBinding;
import zhy2002.neutron.core.NodeRemoveEventBinding;
import zhy2002.neutron.core.ValidationRule;
import zhy2002.neutron.core.di.Owner;
import zhy2002.neutron.core.event.BigDecimalStateChangeEventBinding;
import zhy2002.neutron.core.util.CollectionUtil;

import javax.inject.Inject;
import java.math.BigDecimal;
import java.util.Collection;


public class OwnershipRequiredValidationRule extends ValidationRule<OwnershipListNode<?>> {

    @Inject
    public OwnershipRequiredValidationRule(@Owner OwnershipListNode<?> owner) {
        super(owner);
    }

    private static BigDecimal ONE_HUNDRED = new BigDecimal("100");

    @Override
    protected Collection<EventBinding> createEventBindings() {
        return CollectionUtil.combine(
                super.createEventBindings(),
                new BigDecimalStateChangeEventBinding(
                        e -> e.getOrigin() instanceof OwnershipPercentageNode,
                        e -> this.validate()
                ),
                new NodeRemoveEventBinding<>(
                        e -> this.validate(),
                        OwnershipNodeRemoveEvent.class
                )
        );
    }

    protected OwnershipListNode<?> getOwnershipListNode() {
        return getOwner();
    }

    @Override
    protected String getErrorMessage() {
        BigDecimal value = getOwner().getTotalOwnership();
        if (getOwnershipListNode().getItemCount() > 0 && (value == null || value.compareTo(ONE_HUNDRED) != 0)) {
            return "Total percentage must be 100.";
        }

        return null;
    }
}
