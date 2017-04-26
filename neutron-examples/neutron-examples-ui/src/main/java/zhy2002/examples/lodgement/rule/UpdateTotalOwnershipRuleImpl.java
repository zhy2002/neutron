package zhy2002.examples.lodgement.rule;

import zhy2002.examples.lodgement.gen.event.OwnershipNodeRemoveEvent;
import zhy2002.examples.lodgement.gen.node.OwnershipListNode;
import zhy2002.examples.lodgement.gen.node.OwnershipNode;
import zhy2002.examples.lodgement.gen.node.OwnershipPercentageNode;
import zhy2002.examples.lodgement.gen.rule.UpdateTotalOwnershipRule;
import zhy2002.neutron.EventBinding;
import zhy2002.neutron.NodeRemoveEventBinding;
import zhy2002.neutron.RefreshEventBinding;
import zhy2002.neutron.UiNodeEvent;
import zhy2002.neutron.di.Owner;
import zhy2002.neutron.event.BigDecimalStateChangeEventBinding;
import zhy2002.neutron.util.NeutronEventSubjects;

import javax.inject.Inject;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;


public class UpdateTotalOwnershipRuleImpl extends UpdateTotalOwnershipRule {

    @Inject
    public UpdateTotalOwnershipRuleImpl(@Owner OwnershipListNode<?> owner) {
        super(owner);
    }

    @Override
    protected Collection<EventBinding> createEventBindings() {
        return Arrays.asList(
                new RefreshEventBinding(
                        this::updateTotalOwnership,
                        Collections.singleton(NeutronEventSubjects.NODE_LOADED_REFRESH_REASON)
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
