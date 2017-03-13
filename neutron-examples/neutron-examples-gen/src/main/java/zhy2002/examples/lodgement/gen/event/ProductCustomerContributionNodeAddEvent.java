package zhy2002.examples.lodgement.gen.event;

import zhy2002.examples.lodgement.gen.node.ProductCustomerContributionNode;
import zhy2002.neutron.NodeAddEvent;


public class ProductCustomerContributionNodeAddEvent extends NodeAddEvent<ProductCustomerContributionNode> {

    public ProductCustomerContributionNodeAddEvent(ProductCustomerContributionNode target) {
        super(target);
    }
}
