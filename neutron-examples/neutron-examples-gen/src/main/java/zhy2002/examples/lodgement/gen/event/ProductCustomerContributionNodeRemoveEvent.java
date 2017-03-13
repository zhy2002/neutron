package zhy2002.examples.lodgement.gen.event;

import zhy2002.examples.lodgement.gen.node.ProductCustomerContributionNode;
import zhy2002.neutron.NodeRemoveEvent;


public class ProductCustomerContributionNodeRemoveEvent extends NodeRemoveEvent<ProductCustomerContributionNode> {
    public ProductCustomerContributionNodeRemoveEvent(ProductCustomerContributionNode target) {
        super(target);
    }
}