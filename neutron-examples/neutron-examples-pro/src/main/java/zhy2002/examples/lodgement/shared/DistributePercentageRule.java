package zhy2002.examples.lodgement.shared;

import zhy2002.examples.lodgement.gen.node.AverageFlagNode;
import zhy2002.examples.lodgement.gen.node.OwnershipListNode;
import zhy2002.examples.lodgement.gen.node.OwnershipNode;
import zhy2002.examples.lodgement.gen.node.OwnershipPercentageNode;
import zhy2002.neutron.EventBinding;
import zhy2002.neutron.UiNodeEvent;
import zhy2002.neutron.UiNodeRule;
import zhy2002.neutron.di.Owner;
import zhy2002.neutron.event.BigDecimalStateChangeEventBinding;
import zhy2002.neutron.event.BooleanStateChangeEvent;
import zhy2002.neutron.event.BooleanStateChangeEventBinding;
import zhy2002.neutron.util.NeutronConstants;

import javax.inject.Inject;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collection;

public class DistributePercentageRule extends UiNodeRule<OwnershipListNode<?>> {

    @Inject
    public DistributePercentageRule(@Owner OwnershipListNode<?> owner) {
        super(owner);
    }

    protected OwnershipListNode<?> getOwnershipListNode() {
        return getOwner();
    }

    @Override
    protected Collection<EventBinding> createEventBindings() {
        return Arrays.asList(
                new BooleanStateChangeEventBinding(
                        e -> e.getOrigin() instanceof AverageFlagNode,
                        this::setReadOnly
                ),
                new BigDecimalStateChangeEventBinding(
                        e -> e.getOrigin() instanceof OwnershipPercentageNode && !Boolean.TRUE.equals(e.getOrigin().isReadonly()),
                        e -> this.recalculate()
                ),
                new BooleanStateChangeEventBinding(
                        this::percentageNodeReadOnlySetToTrue,
                        e -> this.recalculate(),
                        NeutronConstants.READONLY
                )
        );
    }

    private boolean percentageNodeReadOnlySetToTrue(BooleanStateChangeEvent e) {
        return e.getOrigin() instanceof OwnershipPercentageNode && Boolean.TRUE.equals(e.getNewValue());
    }

    private void recalculate() {
        int remainingPercentage = 100;
        int averageNodeCount = 0;
        for (int i = 0; i < getOwner().getItemCount(); i++) {
            OwnershipNode node = getOwner().getItem(i);
            if (!Boolean.TRUE.equals(node.getAverageFlagNode().getValue())) {
                BigDecimal value = node.getOwnershipPercentageNode().getValue();
                if (value != null) {
                    remainingPercentage -= value.intValue();
                }
            } else {
                averageNodeCount++;
            }
        }

        if (remainingPercentage > 0 && averageNodeCount > 0) {
            int averagePercentage = remainingPercentage / averageNodeCount;
            for (int i = 0; i < getOwner().getItemCount(); i++) {
                OwnershipNode node = getOwner().getItem(i);
                if (Boolean.TRUE.equals(node.getAverageFlagNode().getValue())) {
                    if (averageNodeCount == 1) {
                        node.getOwnershipPercentageNode().setValue(BigDecimal.valueOf(remainingPercentage));
                    } else {
                        node.getOwnershipPercentageNode().setValue(BigDecimal.valueOf(averagePercentage));
                        remainingPercentage -= averagePercentage;
                        averageNodeCount--;
                    }
                }
            }
        }
    }

    private void setReadOnly(UiNodeEvent event) {
        AverageFlagNode averageFlagNode = (AverageFlagNode) event.getOrigin();
        if (Boolean.TRUE.equals(averageFlagNode.getValue())) {
            averageFlagNode.getParent().getOwnershipPercentageNode().setReadonly(true);
        } else {
            averageFlagNode.getParent().getOwnershipPercentageNode().setReadonly(false);
        }
    }
}
