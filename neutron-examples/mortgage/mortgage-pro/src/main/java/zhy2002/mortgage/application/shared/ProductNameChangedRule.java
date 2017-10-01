package zhy2002.mortgage.application.shared;

import zhy2002.mortgage.application.data.ApplicationNodeConstants;
import zhy2002.mortgage.application.gen.node.*;
import zhy2002.neutron.core.EventBinding;
import zhy2002.neutron.core.RefreshEventBinding;
import zhy2002.neutron.core.UiNodeRule;
import zhy2002.neutron.core.config.NeutronConstants;
import zhy2002.neutron.core.di.Owner;
import zhy2002.neutron.core.event.StringStateChangeEventBinding;
import zhy2002.neutron.core.util.ValueUtil;

import javax.inject.Inject;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collection;

/**
 * Update product description page widget state.
 */
public class ProductNameChangedRule extends UiNodeRule<ProductNameNode> {

    @Inject
    protected ProductNameChangedRule(@Owner ProductNameNode owner) {
        super(owner);
    }

    @Override
    protected Collection<EventBinding> createEventBindings() {
        return Arrays.asList(
                new StringStateChangeEventBinding(
                        (e) -> onChange()
                ),
                new RefreshEventBinding(
                        (e) -> onChange(),
                        NeutronConstants.NODE_LOADED_REFRESH_REASON
                )
        );
    }

    private void onChange() {
        String productName = getOwner().getValue();
        ProductDescriptionNode productDescriptionNode = getOwner().getParent();
        ProductFeaturesNode productFeaturesNode = productDescriptionNode.getParent().getProductFeaturesNode();
        if (ValueUtil.isEmpty(productName)) {
            NodeUtil.disableAllSiblings(getOwner(), true, productDescriptionNode.getProductGroupNode());
            productFeaturesNode.resetValue();
            productFeaturesNode.setDisabled(true);
        } else {
            NodeUtil.disableAllSiblings(getOwner(), false,
                    productDescriptionNode.getProductGroupNode(),
                    productDescriptionNode.getProductInterestOnlyTermNode(),
                    productDescriptionNode.getProductFixedTermNode()
            );

            ProductFixedTermNode fixedTermNode = productDescriptionNode.getProductFixedTermNode();
            if (productName.contains("Fixed")) {
                fixedTermNode.setDisabled(false);
            } else {
                fixedTermNode.resetValue();
                fixedTermNode.setDisabled(true);
            }

            ProductPaymentTypeNode paymentTypeNode = productDescriptionNode.getProductPaymentTypeNode();
            if (productName.contains("Home")) {
                paymentTypeNode.setReadonly(false);
            } else {
                paymentTypeNode.setReadonly(true);
                paymentTypeNode.setValue(ApplicationNodeConstants.PRINCIPAL_AND_INTEREST_OPTION.getValue());
            }

            ProductInterestOnlyTermNode interestOnlyTermNode = productDescriptionNode.getProductInterestOnlyTermNode();
            if (productName.contains("NAB")) {
                interestOnlyTermNode.setMaxValue(new BigDecimal("5"));
            } else {
                interestOnlyTermNode.setMaxValue(new BigDecimal("3"));
            }

            productFeaturesNode.setDisabled(false);
            if (productName.contains("Mortgage")) {
                productFeaturesNode.getProductCreditCardLimitNode().setMaxValue(new BigDecimal("25000"));
            } else {
                productFeaturesNode.getProductCreditCardLimitNode().setMaxValue(new BigDecimal("50000"));
            }
        }
    }
}
