package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.node.*;


public abstract class ProductGroupChangedRule extends UiNodeRule<ProductGroupNode> {

    public ProductGroupChangedRule(ProductGroupNode owner) {
        super(owner);
    }

    protected ProductGroupNode getProductGroupNode() {
        return getOwner();
    }
}
