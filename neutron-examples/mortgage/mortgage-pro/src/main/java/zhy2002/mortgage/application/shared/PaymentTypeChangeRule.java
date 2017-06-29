package zhy2002.mortgage.application.shared;


import zhy2002.mortgage.application.data.ApplicationNodeConstants;
import zhy2002.mortgage.application.gen.node.ProductInterestOnlyTermNode;
import zhy2002.mortgage.application.gen.node.ProductPaymentTypeNode;
import zhy2002.neutron.EventBinding;
import zhy2002.neutron.RefreshEventBinding;
import zhy2002.neutron.UiNodeRule;
import zhy2002.neutron.config.NeutronConstants;
import zhy2002.neutron.di.Owner;
import zhy2002.neutron.event.StringStateChangeEventBinding;

import javax.inject.Inject;
import java.util.Arrays;
import java.util.Collection;

public class PaymentTypeChangeRule extends UiNodeRule<ProductPaymentTypeNode> {

    @Inject
    protected PaymentTypeChangeRule(@Owner ProductPaymentTypeNode owner) {
        super(owner);
    }

    @Override
    protected Collection<EventBinding> createEventBindings() {
        return Arrays.asList(
                new RefreshEventBinding(
                        e -> doUpdate(),
                        NeutronConstants.NODE_LOADED_REFRESH_REASON
                ),
                new StringStateChangeEventBinding(
                        e -> doUpdate()
                )
        );
    }

    private void doUpdate() {
        ProductInterestOnlyTermNode interestOnlyTermNode = getOwner().getParent().getProductInterestOnlyTermNode();
        String value = getOwner().getValue();
        if (ApplicationNodeConstants.INTEREST_ONLY_OPTION.getValue().equals(value)) {
            interestOnlyTermNode.setDisabled(false);
        } else {
            interestOnlyTermNode.resetValue();
            interestOnlyTermNode.setDisabled(true);
        }
    }
}
