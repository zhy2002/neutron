package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.node.*;


public abstract class UpdateProductNodeLabelRule extends UpdateItemNodeLabelRule<ProductNode> {

    public UpdateProductNodeLabelRule(ProductNode owner) {
        super(owner);
    }

    protected ProductNode getProductNode() {
        return getOwner();
    }
}
