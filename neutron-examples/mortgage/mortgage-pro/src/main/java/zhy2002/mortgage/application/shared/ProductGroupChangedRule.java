package zhy2002.mortgage.application.shared;


import zhy2002.mortgage.application.data.ApplicationNodeConstants;
import zhy2002.mortgage.application.gen.node.ProductFeaturesNode;
import zhy2002.mortgage.application.gen.node.ProductGroupNode;
import zhy2002.mortgage.application.gen.node.ProductNameNode;
import zhy2002.neutron.EventBinding;
import zhy2002.neutron.RefreshEventBinding;
import zhy2002.neutron.UiNodeRule;
import zhy2002.neutron.config.NeutronConstants;
import zhy2002.neutron.data.StringOption;
import zhy2002.neutron.di.Owner;
import zhy2002.neutron.event.StringStateChangeEventBinding;
import zhy2002.neutron.util.ValueUtil;

import javax.inject.Inject;
import java.util.Arrays;
import java.util.Collection;

public class ProductGroupChangedRule extends UiNodeRule<ProductGroupNode> {

    @Inject
    public ProductGroupChangedRule(@Owner ProductGroupNode owner) {
        super(owner);
    }

    protected ProductGroupNode getProductGroupNode() {
        return getOwner();
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

    private ProductNameNode getProductNameNode() {
        return getOwner().getParent().getProductNameNode();
    }

    private void onChange() {
        String group = getProductGroupNode().getValue();

        if (ValueUtil.isEmpty(group)) {
            NodeUtil.disableAllSiblings(getOwner(), true);
            ProductFeaturesNode productFeaturesNode = getOwner().getParent().getParent().getProductFeaturesNode();
            productFeaturesNode.resetValue();
            productFeaturesNode.setDisabled(true);
            return;
        }

        StringOption[] productList = ApplicationNodeConstants.NAB_PRODUCT_NAME_MAP.get(group);
        ProductNameNode productNameNode = getProductNameNode();
        if (productList == null) {
            productList = ApplicationNodeConstants.NAB_PRODUCT_NAME;
        }

        if (!Arrays.equals(productList, productNameNode.getOptions())) {
            productNameNode.resetValue();
            productNameNode.setOptions(productList);
        }

        productNameNode.setDisabled(false);
    }


}
