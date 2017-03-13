package zhy2002.examples.lodgement.gen.event;

import zhy2002.examples.lodgement.gen.node.ProductFeeNode;
import zhy2002.neutron.NodeRemoveEvent;


public class ProductFeeNodeRemoveEvent extends NodeRemoveEvent<ProductFeeNode> {
    public ProductFeeNodeRemoveEvent(ProductFeeNode target) {
        super(target);
    }
}