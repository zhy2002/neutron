package zhy2002.examples.lodgement.shared;


import zhy2002.examples.lodgement.data.ApplicationNodeConstants;
import zhy2002.examples.lodgement.gen.node.ProductGroupNode;
import zhy2002.examples.lodgement.gen.node.ProductNameNode;
import zhy2002.neutron.EventBinding;
import zhy2002.neutron.RefreshEventBinding;
import zhy2002.neutron.UiNodeRule;
import zhy2002.neutron.data.StringOption;
import zhy2002.neutron.di.Owner;
import zhy2002.neutron.event.StringStateChangeEventBinding;
import zhy2002.neutron.util.NeutronConstants;

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
        StringOption[] productList = ApplicationNodeConstants.NAB_PRODUCT_NAME_MAP.get(group);
        ProductNameNode productNameNode = getProductNameNode();
        if (productList == null) {
            productList = ApplicationNodeConstants.NAB_PRODUCT_NAME;
        }

        if (!Arrays.equals(productList, productNameNode.getOptions())) {
            productNameNode.setOptions(productList);
            productNameNode.setValue("");
        }

    }
}
