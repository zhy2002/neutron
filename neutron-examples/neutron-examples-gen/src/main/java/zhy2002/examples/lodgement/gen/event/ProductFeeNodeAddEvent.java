package zhy2002.examples.lodgement.gen.event;

import zhy2002.examples.lodgement.gen.node.ProductFeeNode;
import zhy2002.neutron.NodeAddEvent;


public class ProductFeeNodeAddEvent extends NodeAddEvent<ProductFeeNode> {

    public ProductFeeNodeAddEvent(ProductFeeNode target) {
        super(target);
    }
}
