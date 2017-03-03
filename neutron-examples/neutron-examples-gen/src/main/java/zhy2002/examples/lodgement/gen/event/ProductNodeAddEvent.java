package zhy2002.examples.lodgement.gen.event;

import zhy2002.examples.lodgement.gen.node.ProductNode;
import zhy2002.neutron.NodeAddEvent;


public class ProductNodeAddEvent extends NodeAddEvent<ProductNode> {

    public ProductNodeAddEvent(ProductNode target) {
        super(target);
    }
}
