package zhy2002.examples.lodgement.rule;

import zhy2002.examples.lodgement.gen.event.OwnershipNodeRemoveEvent;
import zhy2002.examples.lodgement.gen.node.OwnershipListNode;
import zhy2002.examples.lodgement.gen.node.OwnershipPercentageNode;
import zhy2002.examples.lodgement.gen.rule.OwnershipRequiredValidationRule;
import zhy2002.neutron.EventBinding;
import zhy2002.neutron.NodeRemoveEventBinding;
import zhy2002.neutron.di.Owner;
import zhy2002.neutron.event.BigDecimalStateChangeEventBinding;
import zhy2002.neutron.util.CollectionUtil;

import javax.inject.Inject;
import java.math.BigDecimal;
import java.util.Collection;


public class OwnershipRequiredValidationRuleImpl extends OwnershipRequiredValidationRule {

    @Inject
    public OwnershipRequiredValidationRuleImpl(@Owner OwnershipListNode<?> owner) {
        super(owner);
    }

    private BigDecimal ONE_HUNDRED = new BigDecimal("100");

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
                        OwnershipNodeRemoveEvent.class,
                        getOwner().getName()
                )
        );
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
