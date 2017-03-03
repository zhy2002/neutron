package zhy2002.examples.lodgement.gen.event;

import zhy2002.examples.lodgement.gen.node.ProductNode;
import zhy2002.neutron.NodeRemoveEvent;


public class ProductNodeRemoveEvent extends NodeRemoveEvent<ProductNode> {
    public ProductNodeRemoveEvent(ProductNode target) {
        super(target);
    }
}