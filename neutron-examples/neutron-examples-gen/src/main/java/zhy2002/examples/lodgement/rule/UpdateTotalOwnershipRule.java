package zhy2002.examples.lodgement.rule;

import zhy2002.examples.lodgement.gen.event.OwnershipNodeRemoveEvent;
import zhy2002.examples.lodgement.gen.node.OwnershipListNode;
import zhy2002.examples.lodgement.gen.node.OwnershipNode;
import zhy2002.examples.lodgement.gen.node.OwnershipPercentageNode;
import zhy2002.neutron.*;
import zhy2002.neutron.di.Owner;
import zhy2002.neutron.event.BigDecimalStateChangeEventBinding;
import zhy2002.neutron.config.NeutronConstants;

import javax.inject.Inject;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collection;


public class UpdateTotalOwnershipRule extends UiNodeRule<OwnershipListNode<?>> {

    @Inject
    public UpdateTotalOwnershipRule(@Owner OwnershipListNode<?> owner) {
        super(owner);
    }

    protected OwnershipListNode<?> getOwnershipListNode() {
        return getOwner();
    }

    @Override
    protected Collection<EventBinding> createEventBindings() {
        return Arrays.asList(
                new RefreshEventBinding(
                        this::updateTotalOwnership,
                        NeutronConstants.NODE_LOADED_REFRESH_REASON
                ),
                new BigDecimalStateChangeEventBinding(
                        e -> e.getOrigin() instanceof OwnershipPercentageNode,
                        this::updateTotalOwnership
                ),
                new NodeRemoveEventBinding<>(
                        this::updateTotalOwnership,
                        OwnershipNodeRemoveEvent.class
                )
        );
    }

    private void updateTotalOwnership(UiNodeEvent event) {
        BigDecimal value = new BigDecimal("0");
        for (int i = 0; i < getOwner().getItemCount(); i++) {
            OwnershipNode ownershipNode = getOwner().getItem(i);
            BigDecimal percentage = ownershipNode.getOwnershipPercentageNode().getValue();
            if (percentage != null) {
                value = value.add(percentage);
            }
        }
        getOwner().setTotalOwnership(value);
    }
}
