package zhy2002.examples.lodgement.bankb.di;


import zhy2002.examples.lodgement.gen.node.ContractPriceNode;
import zhy2002.examples.lodgement.gen.node.EstimatedMarketValueNode;
import zhy2002.neutron.EventBinding;
import zhy2002.neutron.RefreshEventBinding;
import zhy2002.neutron.UiNodeRule;
import zhy2002.neutron.config.NeutronConstants;
import zhy2002.neutron.di.Owner;
import zhy2002.neutron.event.BigDecimalStateChangeEventBinding;
import zhy2002.neutron.node.BigDecimalUiNode;

import javax.inject.Inject;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collection;

public class UpdateEstimatedMarketValueRule extends UiNodeRule<ContractPriceNode> {

    @Inject
    protected UpdateEstimatedMarketValueRule(@Owner ContractPriceNode owner) {
        super(owner);
    }

    @Override
    protected Collection<EventBinding> createEventBindings() {
        return Arrays.asList(
                new RefreshEventBinding(
                        e -> update(),
                        NeutronConstants.NODE_LOADED_REFRESH_REASON
                ),
                new BigDecimalStateChangeEventBinding(
                        e -> update()
                )
        );
    }

    private void update() {
        EstimatedMarketValueNode marketValueNode = getOwner().getParent().getEstimatedMarketValueNode();
        if (marketValueNode.hasValue())
            return;

        BigDecimal value = getOwner().getValue();
        marketValueNode.getConfiguration().setConfigValue(BigDecimalUiNode.VALUE_PROPERTY.getName(), value);
        marketValueNode.getConfiguration().setConfigValue(BigDecimalUiNode.VALUE_TEXT_PROPERTY.getName(), value == null ? null : value.toString());
        marketValueNode.queueNotification(NeutronConstants.STATE_CHANGE_NOTIFICATION, null);
    }
}
