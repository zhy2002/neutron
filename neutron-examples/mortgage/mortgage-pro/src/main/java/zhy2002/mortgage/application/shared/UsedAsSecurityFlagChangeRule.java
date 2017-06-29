package zhy2002.mortgage.application.shared;

import zhy2002.mortgage.application.gen.node.UsageNode;
import zhy2002.mortgage.application.gen.node.UsedAsSecurityFlagNode;
import zhy2002.neutron.EventBinding;
import zhy2002.neutron.RefreshEventBinding;
import zhy2002.neutron.UiNodeEvent;
import zhy2002.neutron.UiNodeRule;
import zhy2002.neutron.di.Owner;
import zhy2002.neutron.event.BooleanStateChangeEventBinding;
import zhy2002.neutron.config.NeutronConstants;

import javax.inject.Inject;
import java.util.Arrays;
import java.util.Collection;


public class UsedAsSecurityFlagChangeRule extends UiNodeRule<UsedAsSecurityFlagNode> {

    @Inject
    public UsedAsSecurityFlagChangeRule(@Owner UsedAsSecurityFlagNode owner) {
        super(owner);
    }

    @Override
    protected Collection<EventBinding> createEventBindings() {
        return Arrays.asList(
                new BooleanStateChangeEventBinding(
                        this::updateValue
                ),
                new RefreshEventBinding(
                        this::updateValue,
                        NeutronConstants.NODE_LOADED_REFRESH_REASON
                )
        );
    }

    private void updateValue(UiNodeEvent event) {
        Boolean value = getOwner().getValue();
        UsageNode usageNode = getOwner().getParent();

        if (value == null) {
            usageNode.getBeingPurchasedFlagNode().setRequired(false);

            usageNode.getOwnedOutrightFlagNode().setRequired(true);

            usageNode.getPrimarySecurityFlagNode().resetValue();
            usageNode.getPrimarySecurityFlagNode().setDisabled(true);

            usageNode.getApprovalInPrincipleFlagNode().setDisabled(false);
        } else if (Boolean.TRUE.equals(value)) {
            usageNode.getBeingPurchasedFlagNode().setRequired(true);
            usageNode.getBeingPurchasedFlagNode().setDisabled(false);

            usageNode.getOwnedOutrightFlagNode().resetValue();
            usageNode.getOwnedOutrightFlagNode().setDisabled(true);

            usageNode.getPrimarySecurityFlagNode().setRequired(false);
            usageNode.getPrimarySecurityFlagNode().setDisabled(false);

            usageNode.getApprovalInPrincipleFlagNode().setRequired(true);
            usageNode.getApprovalInPrincipleFlagNode().setDisabled(false);
        } else {
            usageNode.getBeingPurchasedFlagNode().setRequired(false);

            usageNode.getOwnedOutrightFlagNode().setRequired(true);
            usageNode.getOwnedOutrightFlagNode().setDisabled(false);

            usageNode.getPrimarySecurityFlagNode().resetValue();
            usageNode.getPrimarySecurityFlagNode().setDisabled(true);

            usageNode.getApprovalInPrincipleFlagNode().resetValue();
            usageNode.getApprovalInPrincipleFlagNode().setDisabled(true);
        }
    }
}
