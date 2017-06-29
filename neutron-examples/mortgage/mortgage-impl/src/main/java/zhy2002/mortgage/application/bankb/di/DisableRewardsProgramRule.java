package zhy2002.mortgage.application.bankb.di;

import zhy2002.mortgage.application.gen.node.ProductCreditCardTypeNode;
import zhy2002.mortgage.application.gen.node.ProductFeaturesNode;
import zhy2002.neutron.EventBinding;
import zhy2002.neutron.RefreshEventBinding;
import zhy2002.neutron.UiNodeRule;
import zhy2002.neutron.config.NeutronConstants;
import zhy2002.neutron.di.Owner;
import zhy2002.neutron.event.StringStateChangeEventBinding;

import javax.inject.Inject;
import java.util.Arrays;
import java.util.Collection;


public class DisableRewardsProgramRule extends UiNodeRule<ProductCreditCardTypeNode> {

    @Inject
    protected DisableRewardsProgramRule(@Owner ProductCreditCardTypeNode owner) {
        super(owner);
    }

    @Override
    protected Collection<EventBinding> createEventBindings() {
        return Arrays.asList(
                new RefreshEventBinding(
                        e -> check(),
                        NeutronConstants.NODE_LOADED_REFRESH_REASON
                ),
                new StringStateChangeEventBinding(
                        e -> check()
                )
        );
    }

    private void check() {
        ProductFeaturesNode productFeaturesNode = getOwner().getParent();
        if (getOwner().getValue().toLowerCase().contains("rewards")) {
            productFeaturesNode.getProductPrimaryCardHolderNode().getProductRewardsProgramNode().setDisabled(false);
            productFeaturesNode.getProductAdditionalCardHolderNode().getProductRewardsProgramNode().setDisabled(false);
        } else {
            productFeaturesNode.getProductPrimaryCardHolderNode().getProductRewardsProgramNode().resetValue();
            productFeaturesNode.getProductPrimaryCardHolderNode().getProductRewardsProgramNode().setDisabled(true);
            productFeaturesNode.getProductAdditionalCardHolderNode().getProductRewardsProgramNode().resetValue();
            productFeaturesNode.getProductAdditionalCardHolderNode().getProductRewardsProgramNode().setDisabled(true);
        }
    }
}
