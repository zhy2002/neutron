package zhy2002.mortgage.application.shared;

import zhy2002.mortgage.application.gen.node.BeingPurchasedFlagNode;
import zhy2002.mortgage.application.gen.node.UsageNode;
import zhy2002.neutron.core.EventBinding;
import zhy2002.neutron.core.UiNodeRule;
import zhy2002.neutron.core.di.Owner;
import zhy2002.neutron.core.event.BooleanStateChangeEvent;
import zhy2002.neutron.core.event.BooleanStateChangeEventBinding;

import javax.inject.Inject;
import java.util.Arrays;
import java.util.Collection;


public class BeingPurchasedFlagChangeRule extends UiNodeRule<BeingPurchasedFlagNode> {

    @Inject
    public BeingPurchasedFlagChangeRule(@Owner BeingPurchasedFlagNode owner) {
        super(owner);
    }

    protected BeingPurchasedFlagNode getBeingPurchasedFlagNode() {
        return getOwner();
    }

    @Override
    protected Collection<EventBinding> createEventBindings() {
        return Arrays.asList(
                new BooleanStateChangeEventBinding(
                        this::updateValue
                )
        );
    }

    private void updateValue(BooleanStateChangeEvent event) {
        Boolean value = getBeingPurchasedFlagNode().getValue();
        UsageNode usageNode = getBeingPurchasedFlagNode().getParent();

        if (Boolean.TRUE.equals(value)) {
            usageNode.getOwnedOutrightFlagNode().setRequired(false);
            usageNode.getOwnedOutrightFlagNode().resetValue();
            usageNode.getOwnedOutrightFlagNode().setDisabled(true);
        } else if (Boolean.FALSE.equals(value)) {
            usageNode.getOwnedOutrightFlagNode().setRequired(true);
            usageNode.getOwnedOutrightFlagNode().setDisabled(false);
        }
    }
}
